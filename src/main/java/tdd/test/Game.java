package tdd.test;

import java.util.Scanner;

public class Game {
    private Guess guess;
    private static final String WinDescription="you win!";
    private static final String FailDescription="game over, try again...";
    private static final String rightResult="4A0B";
    public Game(Guess guess){
        this.guess=guess;
    }

    public int[] getAnswer(){
        if(guess!=null)
        return guess.getRandomAnswer();
        return null;
    }

    private int[] generateInput(){
        int[] input=new int[4];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<4;i++){
            input[i]=scanner.nextInt();
        }
        return input;
    }

    public static void process(){
        int totalTimes=6;
        int currentTime=0;
        Guess guess=new Guess(new TestAnswerGenerator());
        Game game=new Game(guess);
        int[] answer=game.getAnswer();
        while (currentTime<totalTimes){
            int[] input=game.generateInput();
            String result=guess.compareTheInputAndAnswer(input,answer);
            if(result.equals(rightResult)){
                break;
            }else {
                System.out.println(result);
            }
            currentTime++;
        }
        if(currentTime==6){
            System.out.println(Game.FailDescription);
        }else {
            System.out.println(Game.WinDescription);
        }
    }

    public static void main(String[] args){
        process();
    }
}
