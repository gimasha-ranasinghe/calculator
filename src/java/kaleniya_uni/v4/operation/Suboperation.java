package kaleniya_uni.v4.operation;

public class Suboperation implements Operation{

    public Double execute(Double[] numbers) {
        return numbers[0] - numbers[1];
    }
}
