package kaleniya_uni.v4.operation;

public class Addoperation implements Operation{

    public Double execute(Double[] numbers) {
        return numbers[0] + numbers[1];
    }
}
