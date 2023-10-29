package kaleniya_uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DivoperationTest {

    @Test
    public void should_devide_positive_values() throws InvalidOperationException {
        Divoperation divoperation = new Divoperation();
        Double result = divoperation.execute(new Double[]{6.0, 3.0});

        assertThat(result, is(2.0));

    }

    @Test
    public void should_not_devide_by_zero() throws InvalidOperationException {
        Divoperation divoperation = new Divoperation();
        Double result = divoperation.execute(new Double[]{6.0, 0.0});

    }

}