package operation;

import logger.LogEntry;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Anastasiya on 12.02.2017.
 */
public class Operation {
    private static Logger logger = Logger.getLogger(Operation.class.getName());
    private int number1;
    private int number2;
    private int result;

    public Operation(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;

        logger.addHandler(LogEntry.allLog);
        logger.addHandler(LogEntry.errorLog);
    }

    public int getResultDivide() {
        try {
            result = number1 / number2;
        } catch (ArithmeticException e) {
            logger.log(Level.SEVERE, "Exception: ", e);
        }
        return result;
    }

    public int getResultMultiplication() {
        logger.log(Level.FINE, "FINE level");
        return number1 * number2;
    }

    public int getResultAddition() {
        logger.log(Level.CONFIG, "CONFIG level");
        return number1 + number2;
    }

    public int getResultSubtraction() {
        result = number1 - number2;
        if (result < 0) {
            logger.log(Level.WARNING, "Рузультат < 0");
        }
        return result;
    }
}
