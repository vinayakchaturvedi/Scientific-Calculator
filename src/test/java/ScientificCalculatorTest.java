import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class ScientificCalculatorTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testHandleSquareRootValid() {
        InputStream in = new ByteArrayInputStream("4".getBytes());
        System.setIn(in);
        ScientificCalculator.handleSquareRoot(new Scanner(System.in));
        Assert.assertEquals("Enter the number: Square root of 4 is: 2.0\n", outContent.toString());
    }

    @Test
    public void testHandleFactorialValid() {
        InputStream in = new ByteArrayInputStream("4".getBytes());
        System.setIn(in);
        ScientificCalculator.handleFactorial(new Scanner(System.in));
        Assert.assertEquals("Enter the number: Factorial of 4 is: 24\n", outContent.toString());
    }

    @Test
    public void testHandleLogarithmValid() {
        InputStream in = new ByteArrayInputStream("4".getBytes());
        System.setIn(in);
        ScientificCalculator.handleLogarithm(new Scanner(System.in));
        Assert.assertEquals("Enter the number: Natural Logarithmic value of 4 is: 1.3862943611198906\n", outContent.toString());
    }

    @Test
    public void testHandlePowerValid() {
        InputStream in = new ByteArrayInputStream("4\n2".getBytes());
        System.setIn(in);
        ScientificCalculator.handlePower(new Scanner(System.in));
        Assert.assertEquals("Enter the base number: Enter the power: 4^2 = 16.0\n", outContent.toString());
    }

    @Test
    public void testHandleSquareRootInValid() {
        InputStream in = new ByteArrayInputStream("5".getBytes());
        System.setIn(in);
        ScientificCalculator.handleSquareRoot(new Scanner(System.in));
        Assert.assertNotEquals("Enter the number: Square root of 4 is: 2.0\n", outContent.toString());
    }

    @Test
    public void testHandleFactorialInValid() {
        InputStream in = new ByteArrayInputStream("5".getBytes());
        System.setIn(in);
        ScientificCalculator.handleFactorial(new Scanner(System.in));
        Assert.assertNotEquals("Enter the number: Factorial of 4 is: 24\n", outContent.toString());
    }

    @Test
    public void testHandleLogarithmInValid() {
        InputStream in = new ByteArrayInputStream("5".getBytes());
        System.setIn(in);
        ScientificCalculator.handleLogarithm(new Scanner(System.in));
        Assert.assertNotEquals("Enter the number: Natural Logarithmic value of 4 is: 1.3862943611198906\n", outContent.toString());
    }

    @Test
    public void testHandlePowerInValid() {
        InputStream in = new ByteArrayInputStream("4\n4".getBytes());
        System.setIn(in);
        ScientificCalculator.handlePower(new Scanner(System.in));
        Assert.assertNotEquals("Enter the base number: Enter the power: 4^2 = 16.0\n", outContent.toString());
    }
}