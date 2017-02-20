package operation;

import logger.LogEntry;

import java.util.logging.Logger;

/**
 * Created by Anastasiya on 12.02.2017.
 */
public class Operation {
    private int number1;
    private int number2;

    public Operation(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int getResultDivide() throws ArithmeticException{
        return number1 / number2;
    }

    public int getResultMultiplication(){
        return number1 * number2;
    }

    public int getResultAddition() {
        return number1 + number2;
    }

    public int getResultSubtraction() {
        return number1 - number2;
    }
}
