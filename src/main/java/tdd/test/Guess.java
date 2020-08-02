package tdd.test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Guess {
    private AnswerGenerator answerGenerator;
    private final static String WrongInputMessage="Wrong Input，Input again";
    private final static String OutputA="A";
    private final static String OutputB="B";
    public Guess(AnswerGenerator answerGenerator){
        this.answerGenerator=answerGenerator;
    }

    public int[] getRandomAnswer(){
        return this.answerGenerator.generateRandom();
    }

    public String compareTheInputAndAnswer(int[] input,int[] answer){
        if(!isTheInputArrayLegal(input))
            return WrongInputMessage;
        int countOfA=this.countOfA(input,answer);
        int countOfIncludedNumber=this.countOfIncludedNumber(input,answer);
        return String.format("%d%s%d%s",countOfA,OutputA,(countOfIncludedNumber-countOfA),OutputB);
    }

    private boolean isTheInputArrayLegal(int[] input){
        if (input.length>4)
            return false;
        input = Arrays.stream(input).distinct().toArray();
        return input.length==4;
    }

    private int countOfA(int[] input,int[] answer){
        int count=0;
        for(int i=0;i<input.length;i++){
            if(input[i]==answer[i]){
                count++;
            }
        }
        return count;
    }

    private int countOfIncludedNumber(int[] input,int[] answer){
        int[] concatArray = IntStream.concat(Arrays.stream(input),Arrays.stream(answer)).distinct().toArray();
        return 8-concatArray.length;
    }

}
