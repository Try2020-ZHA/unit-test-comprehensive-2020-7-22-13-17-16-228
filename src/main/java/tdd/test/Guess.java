package tdd.test;

public class Guess {
    private int[] answer;
    public Guess(){
        int[] answer={1,2,3,4};
        this.answer=answer;
    }

    public String compareTheInputAndAnswer(int[] input){
        if(!isTheInputArrayLegal(input))
            return "the input illegal";
        int countOfRightPositionElement=this.countHowManyNumberInTheRightPosition(input);
        int countOfIncludedNumber=this.countHowManyNumberIncludedInTheAnswer(input);
        return countOfRightPositionElement+"A"+(countOfIncludedNumber-countOfRightPositionElement)+"B";
    }

    private boolean isTheInputArrayLegal(int[] input){
        for(int i=0;i<input.length-1;i++){
            for(int j=i+1;j<input.length;j++){
                if(input[i]==input[j])
                    return false;
            }
        }
        return true;
    }

    private int countHowManyNumberInTheRightPosition(int[] input){
        int count=0;
        for(int i=0;i<input.length;i++){
            if(input[i]==this.answer[i]){
                count++;
            }
        }
        return count;
    }

    private int countHowManyNumberIncludedInTheAnswer(int[] input){
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
