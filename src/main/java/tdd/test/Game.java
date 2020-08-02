package tdd.test;

import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        int totalTimes=6;
        Guess guess=new Guess(new TestAnswerGenerator());
        int[] answer= guess.getRandomAnswer();
        Scanner scanner=new Scanner(System.in);
        int[] input=new int[4];
        for(int i=0;i<4;i++){
            System.out.printf(" ", answer[i]);
        }
        int begin=0;
        while (begin<totalTimes){
            for(int i=0;i<4;i++){
                input[i]=scanner.nextInt();
            }
            guess.compareTheInputAndAnswer(input,answer);
        }

    }
}
