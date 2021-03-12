import org.junit.Assert;
import org.junit.Test;

public class ScientificCalculatorTest {

    private ScientificCalculator scientificCalculator = new ScientificCalculator();
    private static final double DELTA = 1e-15;

    @Test
    public void testHandleSquareRootValid() {
        Assert.assertEquals(3.0, scientificCalculator.handleSquareRoot(9), DELTA);
        Assert.assertEquals(2.0, scientificCalculator.handleSquareRoot(4), DELTA);
    }

    @Test
    public void testHandleFactorialValid() {
        Assert.assertEquals(24, scientificCalculator.handleFactorial(4));
        Assert.assertEquals(120, scientificCalculator.handleFactorial(5));
    }

    @Test
    public void testHandleLogarithmValid() {
        Assert.assertEquals(1.3862943611198906, scientificCalculator.handleLogarithm(4), DELTA);
        Assert.assertEquals(1.6094379124341003, scientificCalculator.handleLogarithm(5), DELTA);
    }

    @Test
    public void testHandlePowerValid() {
        Assert.assertEquals(16.0, scientificCalculator.handlePower(2, 4), DELTA);
        Assert.assertEquals(25.0, scientificCalculator.handlePower(5, 2), DELTA);
    }

    @Test
    public void testHandleSquareRootInValid() {
        Assert.assertNotEquals(3.0, scientificCalculator.handleSquareRoot(4), DELTA);
        Assert.assertNotEquals(5, scientificCalculator.handleSquareRoot(10), DELTA);
    }

    @Test
    public void testHandleFactorialInValid() {
        Assert.assertNotEquals(24, scientificCalculator.handleFactorial(5));
        Assert.assertNotEquals(120, scientificCalculator.handleFactorial(6));
    }

    @Test
    public void testHandleLogarithmInValid() {
        Assert.assertNotEquals(3.0, scientificCalculator.handleLogarithm(5), DELTA);
        Assert.assertNotEquals(0.0, scientificCalculator.handleLogarithm(11), DELTA);
    }

    @Test
    public void testHandlePowerInValid() {
        Assert.assertNotEquals(9.0, scientificCalculator.handlePower(3, 3), DELTA);
        Assert.assertNotEquals(100.0, scientificCalculator.handlePower(10, 3), DELTA);
    }
}