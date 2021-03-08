
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class ScientificCalculator {

    private static final Logger LOGGER = LogManager.getLogger(ScientificCalculator.class);

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String message = "Select the appropriate option from the following list: \n" +
                    "1. Square root\n" +
                    "2. Factorial\n" +
                    "3. Natural Logarithm\n" +
                    "4. Power\n" +
                    "5. Exit\n" +
                    "Enter you choice: ";
            System.out.print(message);
            int operation = sc.nextInt();
            while (operation != 5) {
                System.out.println("====================================================");
                switch (operation) {
                    case 1:
                        handleSquareRoot(sc);
                        break;
                    case 2:
                        handleFactorial(sc);
                        break;
                    case 3:
                        handleLogarithm(sc);
                        break;
                    case 4:
                        handlePower(sc);
                        break;
                }
                System.out.println("====================================================");
                System.out.print(message);
                operation = sc.nextInt();
            }
        } catch (Exception exception) {
            System.out.println("Invalid Input found !!! please restart the application and provide proper input.");
            LOGGER.error("Invalid Input found !!! please restart the application and provide proper input.");
        }
    }

    public static void handleSquareRoot(Scanner sc) {
        System.out.print("Enter the number: ");
        double number = sc.nextDouble();
        double result = Math.sqrt(number);
        System.out.println("Square root of " + number + " is: " + result);
        LOGGER.info("SQUARE_ROOT - Input:" + number + " - Output:" + result);
    }

    public static void handleFactorial(Scanner sc) {
        System.out.print("Enter the number: ");
        int number = sc.nextInt(), i = 1;
        long factorial = 1;
        while (i <= number) {
            factorial = factorial * i++;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
        LOGGER.info("FACTORIAL - Input:" + number + " - Output:" + factorial);
    }

    public static void handleLogarithm(Scanner sc) {
        System.out.print("Enter the number: ");
        double number = sc.nextDouble();
        double result = Math.log(number);
        System.out.println("Natural Logarithmic value of " + number + " is: " + result);
        LOGGER.info("LOGARITHM - Input:" + number + " - Output:" + result);
    }

    public static void handlePower(Scanner sc) {
        System.out.print("Enter the base number: ");
        double number = sc.nextDouble();
        System.out.print("Enter the power: ");
        double power = sc.nextDouble();
        double result = Math.pow(number, power);
        System.out.println("Power function: " + number + "^" + power + " = " + result);
        LOGGER.info("POWER_FUNCTION - Input:" + number + "^" + power + " - Output:" + result);
    }

}
