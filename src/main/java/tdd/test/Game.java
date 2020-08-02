package tdd.test;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        int totalTimes=6;
        Guess guess=new Guess(new TestAnswerGenerator());
        int[] answer= guess.getRandomAnswer();
        System.out.println( "aaa");
        Scanner scanner=new Scanner(System.in);
        int[] input=new int[4];
        System.out.println( Arrays.toString(answer));
        int begin=0;
        while (begin<totalTimes){
            for(int i=0;i<4;i++){
                input[i]=scanner.nextInt();
            }
            String result=guess.compareTheInputAndAnswer(input, answer);
            if(result.equals("4A0B")){
                System.out.println("you win!");
                break;
            }else {
                System.out.println(result);
            }
            begin++;
        }

    }
}
