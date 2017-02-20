package operation;

import org.junit.Assert;

/**
 * Created by Anastasiya on 21.02.2017.
 */
public class OperationTest {
    int result;
    Operation testOperation;

    @org.junit.Test
    public void getResultMultiplication() throws Exception {
        testOperation = new Operation(3,3);
        result = testOperation.getResultMultiplication();
        Assert.assertEquals(9, result);
    }

    @org.junit.Test
    public void getResultAddition() throws Exception {
        testOperation = new Operation(2,2);
        result = testOperation.getResultAddition();
        Assert.assertEquals(4, result);
    }

    @org.junit.Test
    public void getResultSubtraction() throws Exception {
        testOperation = new Operation(10,3);
        result = testOperation.getResultSubtraction();
        Assert.assertEquals(7, result);
    }

    @org.junit.Test (expected = ArithmeticException.class)
    public void getResultDivide() throws Exception {
        testOperation = new Operation(2,0);
        testOperation.getResultDivide();
    }
}