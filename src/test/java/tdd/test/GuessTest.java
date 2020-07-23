package tdd.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GuessTest {
    @Test
    public void should_output_illegal_when_guess_four_numbers_given_1134(){
        //given
        Guess guess=new Guess();
        int[] answer={1,2,3,4};
        int[] input={1,1,3,4};
        //when
        String result=guess.compareTheInputAndAnswer(input,answer);
        //then
        Assertions.assertEquals("Wrong Input，Input again",result);
    }

    @Test
    public void should_output_4A0B_when_guess_four_numbers_given_1234(){
        //given
        Guess guess=new Guess();
        int[] answer={1,2,3,4};
        int[] input={1,2,3,4};
        AnswerGenerator answerGenerator= Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn(answer);
        //when
        String result=guess.compareTheInputAndAnswer(input,answer);
        //then
        Assertions.assertEquals("4A0B",result);
    }

    @Test
    public void should_output_0A0B_when_guess_four_numbers_given_5678(){
        //given
        int[] input={5,6,7,8};
        int[] answer={1,2,3,4};
        Guess guess=new Guess();
        //when
        String result=guess.compareTheInputAndAnswer(input,answer);
        //then
        Assertions.assertEquals("0A0B",result);
    }

    @Test
    public void should_output_1A0B_when_guess_four_numbers_given_1678(){
        //given
        int[] input={1,6,7,8};
        int[] answer={1,2,3,4};
        Guess guess=new Guess();
        //when
        String result=guess.compareTheInputAndAnswer(input,answer);
        //then
        Assertions.assertEquals("1A0B",result);
    }

    @Test
    public void should_output_1A1B_when_guess_four_numbers_given_1672(){
        //given
        int[] input={1,6,7,2};
        int[] answer={1,2,3,4};
        Guess guess=new Guess();
        //when
        String result=guess.compareTheInputAndAnswer(input,answer);
        //then
        Assertions.assertEquals("1A1B",result);
    }

    @Test
    public void should_output_0A1B_when_guess_four_numbers_given_5672(){
        //given
        Guess guess=new Guess();
        int[] input={5,6,7,2};
        int[] answer={1,2,3,4};
        //when
        String result=guess.compareTheInputAndAnswer(input,answer);
        //then
        Assertions.assertEquals("0A1B",result);
    }

    @Test
    public void should_output_0A4B_when_guess_four_numbers_given_4321(){
        //given
        Guess guess=new Guess();
        int[] input={4,3,2,1};
        int[] answer={1,2,3,4};
        //when
        String result=guess.compareTheInputAndAnswer(input,answer);
        //then
        Assertions.assertEquals("0A4B",result);
    }
}
