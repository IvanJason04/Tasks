import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int x = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int y = sc.nextInt();

        int resultAdd = add(x, y);
        int resultSubtract = subtract(x, y);
        int resultMultiply = multiply(x, y);
        int resultDivide = divide(x, y);

        System.out.println("Addition Result: " + resultAdd);
        System.out.println("Subtraction Result: " + resultSubtract);
        System.out.println("Multiplication Result: " + resultMultiply);
        System.out.println("Division Result " + resultDivide);
    }
    public static int add(int a, int b){
        int c = Math.addExact(a, b);
        return c;
    }

    public static int subtract(int a, int b){
        int c = Math.subtractExact(a, b);
        return c;
    }

    public static int multiply(int a, int b){
        int c = Math.multiplyExact(a, b);
        return c;
    }

    public static int divide(int a, int b){
        int c = Math.floorDiv(a, b);
        return c;
    }

}
