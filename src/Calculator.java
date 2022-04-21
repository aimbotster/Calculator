import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input_data = new Scanner(System.in);


        System.out.println("Enter your first number");
        double num1 = input_data.nextDouble();

        System.out.println("Select operation");
        String operation = input_data.next();

        System.out.println("Enter your second number");
        double num2 = input_data.nextDouble();


//            if (operation.equals("+")) {
//                double result = num1 + num2;
//                System.out.println(result);
//            } else if (operation.equals("-")) {
//                double result = num1 - num2;
//                System.out.println(result);
//            } else if (operation.equals("*")) {
//                double result = num1 * num2;
//                System.out.println(result);
//            } else if (operation.equals("/")) {
//                double result = num1 / num2;
//                System.out.println(result);
//            } else {
//                System.out.println("Unidentified");
//                System.exit(0);
//            }


        switch (operation) {
            case "+" -> {
                double result = num1 + num2;
                System.out.println(result);
            }
            case "-" -> {
                double result = num1 - num2;
                System.out.println(result);
            }
            case "*" -> {
                double result = num1 * num2;
                System.out.println(result);
            }
            case "/" -> {
                double result = num1 / num2;
                System.out.println(result);
            }

        }
    }
}