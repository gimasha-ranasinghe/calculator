package kaleniya_uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AddoperationTest {

    //test cases
    //positive num + positive num => correct answer 1+1=>2
    //negative num + negative num
    //positive num + negative num
    //zero + zero

    @Test
    public void should_add_positive_values(){
        Addoperation addOperation = new Addoperation();
        Double result = addOperation.execute(new Double[]{5.0, 6.0});

        assertThat(result, is(11.0));

    }

    @Test
    public void should_add_zeros(){
        Addoperation addOperation = new Addoperation();
        Double result = addOperation.execute(new Double[]{0.0, 0.0});

        assertThat(result, is(0.0));

    }

    @Test
    public void should_add_negative_values(){
        Addoperation addOperation = new Addoperation();
        Double result = addOperation.execute(new Double[]{-1.0, -2.0});

        assertThat(result, is(-3.0));

    }

}