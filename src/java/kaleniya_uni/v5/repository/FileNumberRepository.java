package kaleniya_uni.v5.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNumberRepository implements NumberRepository{

    public Double[] getNumbers() throws NumberRepositoryException {
        //read numbers from the text file
        List<String> numbersstr = null;
        try {
            numbersstr = Files.readAllLines(
                    Paths.get("C:/Users/User/Desktop/Year 2 -Sem 1/SEND 21222 - Software Construction/My Calculator/Numbers.txt")
            );
        } catch (IOException e) {
            throw new NumberRepositoryException(e, "Coudn't read the text file");
        }

        //convert into doubles and get values
        double num1 = Double.parseDouble(numbersstr.get(0));
        double num2 = Double.parseDouble(numbersstr.get(1));

        return new Double[]{num1, num2};
    }
}
