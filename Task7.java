import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArithmeticOperations obj = new ArithmeticOperations();

        System.out.println("Enter First Number: ");
        int number1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int number2 = sc.nextInt();

        int sum = obj.addition(number1, number2);
        int difference = obj.subtraction(number1,number2);
        int product = obj.multiplication(number1,number2);
        double quotient = obj.division(number1,number2);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);

    }
}

class ArithmeticOperations{

    int addition(int a, int b){
        return a + b;
    }

    int subtraction(int a, int b){
        return a - b;
    }

    int multiplication(int a, int b){
        return a * b;
    }

    double division(int a, int b){
        if ( b == 0 ){
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }
}
