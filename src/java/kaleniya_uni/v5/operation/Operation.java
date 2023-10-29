package kaleniya_uni.v5.operation;

//Abstract class or Interface class
public interface Operation {
    Double execute(Double[] numbers) throws InvalidOperationException;

}
//Interface class is better for this situation