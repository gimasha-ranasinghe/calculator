package kaleniya_uni.v5.input;

public class CommandLineInputs implements Inputs{

    private final String[] args;

    public CommandLineInputs(String[] arguments) {
        this.args = arguments;
    }

    public String getOperator() throws InvalidInputException {
        //Make sure to validate arguments before using...
        if (args.length == 0) {
            throw new InvalidInputException("Please provide the operation as an argument");
        }

        String operator = args[0];
        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul") || operator.equals("div"))) {
            throw new InvalidInputException("Please provide add, sub, mul or div as operator argument");

        }

        return operator;
    }
}
