package kaleniya_uni.V3;

import kaleniya_uni.V3.operation.Addoperation;
import kaleniya_uni.V3.operation.Muloperation;
import kaleniya_uni.V3.operation.Suboperation;

import java.io.IOException;

public class Main {

    //Main class is the coordinator
    public static void main(String[] args) throws IOException {


        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();

        double result = 0;

        //or use a switch case
        if (operator.equals("add")) {
            Addoperation addOperation = new Addoperation();
            result = addOperation.execute(numbers);
        } else if (operator.equals("sub")) {
            Suboperation subOperation = new Suboperation();
            result = subOperation.execute(numbers);
        } else if (operator.equals("mul")) {
            Muloperation mulOperation = new Muloperation();
            result = mulOperation.execute(numbers);
        }

        System.out.println("The result is = " + result);

        //still violates single responsibility principle
        //v3 finished

    }
}
