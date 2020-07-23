package tdd.test;

public class Guess {
    public Guess(){
    }

    public String compareTheInputAndAnswer(int[] input,int[] answer){
        if(!isTheInputArrayLegal(input))
            return "Wrong Input，Input again";
        int countOfRightPositionElement=this.countHowManyNumberInTheRightPosition(input,answer);
        int countOfIncludedNumber=this.countHowManyNumberIncludedInTheAnswer(input,answer);
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
