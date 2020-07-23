package tdd.test;

public class Guess {
    private int[] answer;
    public Guess(){
        int[] answer={1,2,3,4};
        this.answer=answer;
    }

    public String compareTheInputAndAnswer(int[] input){
        return this.countHowManyNumberInTheRightPosition(input)+"A"+this.countHowManyNumberIncludedInTheAnswer(input)+"B";
    }

    private int countHowManyNumberInTheRightPosition(int[] input){
        int count=0;
        for(int i=0;i<input.length;i++){
            if(this.answer[i]==input[i]){
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
