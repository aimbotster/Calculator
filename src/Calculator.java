import java.util.Scanner;

public class Calculator {

        public static void main(String[] args) {

            Scanner input_data = new Scanner(System.in);

            System.out.println("Enter your first number");
            double num1 = input_data.nextDouble();
            System.out.println("Enter your second number");
            double num2 = input_data.nextDouble();
            double Result = num1*num2;
            System.out.println(Result);
        }
    }

