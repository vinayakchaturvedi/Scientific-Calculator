import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
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
    }

    private static void handleSquareRoot(Scanner sc) {
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Square root of " + number + " is: " + Math.sqrt(number));
    }

    private static void handleFactorial(Scanner sc) {
        System.out.print("Enter the number: ");
        int number = sc.nextInt(), i = 1;
        long factorial = 1;
        while (i <= number) {
            factorial = factorial * i++;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    private static void handleLogarithm(Scanner sc) {
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Natural Logarithmic value of " + number + " is: " + Math.log(number));
    }

    private static void handlePower(Scanner sc) {
        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        System.out.println(number + "^" + power + " = " + Math.pow(number, power));
    }

}
