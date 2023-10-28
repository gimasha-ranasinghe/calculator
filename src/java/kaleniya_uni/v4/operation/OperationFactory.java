package kaleniya_uni.v4.operation;

//Factory design pattern
public class OperationFactory {

    //can this make static also
    public Operation getInstance(String operator){

        Operation operation = null;

        if (operator.equals("add")) {
            operation = new Addoperation();
        } else if (operator.equals("sub")) {
            operation = new Suboperation();
        } else if (operator.equals("mul")) {
            operation = new Muloperation();
        }

        return operation;
    }
}
