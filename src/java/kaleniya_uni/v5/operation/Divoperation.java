package kaleniya_uni.v5.operation;

public class Divoperation implements Operation {

    public Double execute(Double[] numbers) throws InvalidOperationException {

        if(numbers[1]==0){
            throw new InvalidOperationException("Do not devide by zero");
        }
        return numbers[0] / numbers[1];
    }
}
