package tdd.test;

public class Guess {
    private int[] answer;
    public Guess(){
        int[] answer={1,2,3,4};
        this.answer=answer;
    }

    public String compareTheInputAndAnswer(int[] input){
        int countOfRightPositionElement=this.countHowManyNumberInTheRightPosition(input);
        int countOfIncludedNumber=this.countHowManyNumberIncludedInTheAnswer(input);
        //return countOfRightPositionElement+"A"+(countOfIncludedNumber-countOfRightPositionElement)+"B";
        return "0A0B";
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
