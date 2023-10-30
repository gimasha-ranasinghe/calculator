package kaleniya_uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

public class OperationFactoryTest {
    //1.if the operator is add -> should return an object of Addoperation class
    @Test
    public void should_return_Addoperation_object_when_operator_is_add(){
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("add");

        assertThat(operation, instanceOf(Addoperation.class));
    }

    @Test
    public void should_return_Suboperation_object_when_operator_is_sub(){
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("sub");

        assertThat(operation, instanceOf(Suboperation.class));
    }

    @Test
    public void should_return_Muloperation_object_when_operator_is_mul(){
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("mul");

        assertThat(operation, instanceOf(Muloperation.class));
    }

    @Test
    public void should_return_Divoperation_object_when_operator_is_div(){
        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance("div");

        assertThat(operation, instanceOf(Divoperation.class));
    }



}