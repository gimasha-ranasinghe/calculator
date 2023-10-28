package kaleniya_uni.v4;

import kaleniya_uni.v4.operation.*;

import java.io.IOException;

public class Main {

    //Main class is the coordinator
    public static void main(String[] args) throws IOException {


        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();

        //if getInstance in OperationFactory is static no need of this first line
        OperationFactory operationFactory = new OperationFactory(); //this one
        Operation operation = operationFactory.getInstance(operator);
        double result = operation.execute(numbers);

        UI ui = new UI();
        ui.showMessage("The result is "+ result);

    }
}
