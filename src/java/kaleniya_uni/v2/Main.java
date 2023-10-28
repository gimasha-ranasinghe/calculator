package kaleniya_uni.v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
//import static java.io.DeleteOnExitHook.files;

public class Main {
    public static void main(String[] args) throws IOException {

        //Make sure to validate arguments before using...
        if (args.length == 0) {
            System.out.println("Please provide the operation as an argument");
            return;
        }

        String operator = args[0];
        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul"))) {
            System.out.println("Please provide add, sub or mul as operator argument");
            return;
        }

        //read numbers from the text file
        List<String> numbersstr = Files.readAllLines(
                Paths.get("C:/Users/User/Desktop/Year 2 -Sem 1/SEND 21222 - Software Construction/My Calculator/Numbers.txt")
        );

        //convert into doubles and get values
        double num1 = Double.parseDouble(numbersstr.get(0));
        double num2 = Double.parseDouble(numbersstr.get(1));

        //or use a switch case
        double result = 0;
        if (operator.equals("add")) {
            result = num1 + num2;
        } else if (operator.equals("sub")) {
            result = num1 - num2;
        } else if (operator.equals("mul")) {
            result = num1 * num2;
        }

        System.out.println("The result is = " + result);

        //violates the principles
        //can not do unit testing
    }
}
