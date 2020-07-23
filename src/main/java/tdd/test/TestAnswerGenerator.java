package tdd.test;

public class TestAnswerGenerator implements AnswerGenerator {
    private int[] answer;
    public TestAnswerGenerator(int[] answer){
        this.answer=answer;
    }

    @Override
    public int[] generate() {
        return answer;
    }
}
