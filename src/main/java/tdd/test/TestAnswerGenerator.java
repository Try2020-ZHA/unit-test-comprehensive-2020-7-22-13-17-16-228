package tdd.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
            int randomNumber=random.nextInt(10);
            randomAnswer.add(randomNumber);
            randomAnswer = randomAnswer.stream().distinct().collect(Collectors.toList());
        }
        int[] result=new int[4];
        for(int i=0;i<4;i++){
            result[i]=randomAnswer.get(i);
        }
        return result;
    }
}
