package tdd.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GuessTest {
    @Test
    public void should_output_4A0B_when_guess_four_numbers_given_1234(){
        //given
        int[] input={1,2,3,4};
        Guess guess=new Guess();
        //when
        String result=guess.compareTheInputAndAnswer(input);
        //then
        Assertions.assertEquals("4A0B",result);
    }

    @Test
    public void should_output_0A0B_when_guess_four_numbers_given_5678(){
        //given
        int[] input={5,6,7,8};
        Guess guess=new Guess();
        //when
        String result=guess.compareTheInputAndAnswer(input);
        //then
        Assertions.assertEquals("0A0B",result);
    }
}
