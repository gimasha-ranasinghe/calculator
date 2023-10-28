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
        }else if (operator.equals("div")) {
            operation = new Divoperation();
        }//violation of open close principle
        //in factory pattern this is a known and fixable violation


        return operation;
    }
}
