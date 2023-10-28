package kaleniya_uni.v4;

public class CommandLineInputs {

    private final String[] args;

    public CommandLineInputs(String[] arguments) {
        this.args = arguments;
    }

    public String getOperator() {
        //Make sure to validate arguments before using...
        if (args.length == 0) {
            System.out.println("Please provide the operation as an argument");
            return ""; //will change in future
        }

        //violates open close principle here
        String operator = args[0];
        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul") || operator.equals("div"))) {
            System.out.println("Please provide add, sub, mul or div as operator argument");
            return "";
        }

        return operator;
    }
}
