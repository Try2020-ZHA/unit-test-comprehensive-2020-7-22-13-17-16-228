package tdd.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class TestAnswerGenerator implements AnswerGenerator {
    private int[] answer;

    public TestAnswerGenerator(){}
    public TestAnswerGenerator(int[] answer){
        this.answer=answer;
    }

    @Override
    public int[] generate() {
        return answer;
    }

    public int[] generateRandom(){
        List<Integer> randomAnswer=new ArrayList<>(4);
        Random random=new Random();
        while (randomAnswer.size()<4){
            randomAnswer.add(random.nextInt(10));
            randomAnswer = randomAnswer.stream().distinct().collect(Collectors.toList());
        }
        return Arrays.stream(randomAnswer.toArray(new Integer[4])).mapToInt(Integer::valueOf).toArray();
    }
}
