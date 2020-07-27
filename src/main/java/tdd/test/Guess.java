package tdd.test;

import java.util.Arrays;

public class Guess {
    private AnswerGenerator answerGenerator;
    private final static String wrongInputMessage="Wrong Input，Input again";
    public Guess(AnswerGenerator answerGenerator){
        this.answerGenerator=answerGenerator;
    }

    public String compareTheInputAndAnswer(int[] input,int[] answer){
        if(!isTheInputArrayLegal(input))
            return wrongInputMessage;
        int countOfRightPositionElement=this.countHowManyNumberInTheRightPosition(input,answer);
        int countOfIncludedNumber=this.countHowManyNumberIncludedInTheAnswer(input,answer);
        return countOfRightPositionElement+"A"+(countOfIncludedNumber-countOfRightPositionElement)+"B";
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
        int count=0;
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input.length;j++){
                if(answer[i]==input[j]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
