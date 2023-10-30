package kaleniya_uni.v5;

import kaleniya_uni.v5.operation.Addoperation;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CalculatorAppTest {



    @Test
    public void should_add_positive_values(){
        Addoperation addOperation = new Addoperation();
        Double result = addOperation.execute(new Double[]{5.0, 6.0});

        assertThat(result, is(11.0));

    }


}