package tdd.test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Guess {
    private AnswerGenerator answerGenerator;
    private final static String WrongInputMessage="Wrong Input，Input again";
    private final static String OutputA="A";
    private final static String OutputB="B";
    public Guess(AnswerGenerator answerGenerator){
        this.answerGenerator=answerGenerator;
    }

    public String compareTheInputAndAnswer(int[] input,int[] answer){
        if(!isTheInputArrayLegal(input))
            return WrongInputMessage;
        int countOfRightPositionElement=this.countHowManyNumberInTheRightPosition(input,answer);
        int countOfIncludedNumber=this.countHowManyNumberIncludedInTheAnswer(input,answer);
        return countOfRightPositionElement+OutputA+(countOfIncludedNumber-countOfRightPositionElement)+OutputB;
    }

    private boolean isTheInputArrayLegal(int[] input){
        input = Arrays.stream(input).distinct().toArray();
        return input.length==4;
    }

    private int countHowManyNumberInTheRightPosition(int[] input,int[] answer){
        int count=0;
        for(int i=0;i<input.length;i++){
            if(input[i]==answer[i]){
                count++;
            }
        }
        return count;
    }

    private int countHowManyNumberIncludedInTheAnswer(int[] input,int[] answer){
        int[] concatArray = IntStream.concat(Arrays.stream(input),Arrays.stream(answer)).distinct().toArray();
        return 8-concatArray.length;
    }
}
