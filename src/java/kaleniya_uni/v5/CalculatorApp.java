package kaleniya_uni.v5;

import kaleniya_uni.v5.UI.UI;
import kaleniya_uni.v5.input.Inputs;
import kaleniya_uni.v5.operation.InvalidOperationException;
import kaleniya_uni.v5.operation.Operation;
import kaleniya_uni.v5.operation.OperationFactory;
import kaleniya_uni.v5.repository.NumberRepository;

import java.io.IOException;

public class CalculatorApp {

    private final Inputs inputs;
    private final NumberRepository numberRepository;
    private final OperationFactory operationFactory;
    private final UI ui;

    public CalculatorApp(Inputs inputs, NumberRepository numberRepository, OperationFactory operationFactory, UI ui) {

        this.inputs = inputs;
        this.numberRepository = numberRepository;
        this.operationFactory = operationFactory;
        this.ui = ui;
    }

    public void execute() throws IOException { // will change exception part
        String operator = inputs.getOperator();
        Double[] numbers = numberRepository.getNumbers();
        Operation operation = operationFactory.getInstance(operator);
        Double result = null;
        try {
            result = operation.execute(numbers);
        } catch (InvalidOperationException e) {
            ui.showMessage("Error occured."+e.getMessage());
            return;
        }
        ui.showMessage("The result is "+ result);

    }
}
