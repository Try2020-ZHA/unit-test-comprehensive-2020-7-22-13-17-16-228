package tdd.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GuessTest {
    @Test
    public void should_output_4A0B_when_guess_four_numbers_given_1234(){
        //given
        Guess guess=new Guess();
        int[] input={1,2,3,4};
        //when
        String result=guess.compareTheInputAndAnswer(input);
        //then
        Assertions.assertEquals("4A0B",result);
    }
}
