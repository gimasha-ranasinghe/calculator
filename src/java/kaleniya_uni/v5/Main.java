package kaleniya_uni.v5;

import kaleniya_uni.v5.UI.CmdLineUI;
import kaleniya_uni.v5.UI.UI;
import kaleniya_uni.v5.input.CommandLineInputs;
import kaleniya_uni.v5.input.Inputs;
import kaleniya_uni.v5.operation.Operation;
import kaleniya_uni.v5.operation.OperationFactory;
import kaleniya_uni.v5.repository.FileNumberRepository;
import kaleniya_uni.v5.repository.NumberRepository;
import kaleniya_uni.v5.repository.SqlNumberRepository;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        Inputs inputs = new CommandLineInputs(args);
        NumberRepository numberRepository = new FileNumberRepository();
        OperationFactory operationFactory = new OperationFactory(); //this one
        UI ui = new CmdLineUI();
        CalculatorApp calculatorApp = new CalculatorApp(inputs, numberRepository, operationFactory, ui);
        calculatorApp.execute();

    }
}
