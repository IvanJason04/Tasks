import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First number: ");
        int number1 = scanner.nextInt();

        System.out.println("Enter Second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Enter Third number: ");

        int number3 = scanner.nextInt();

        if(number1 == number2 && number2 == number3)
            System.out.println("All numbers are equal");
        else {
            int largest = number1;

            if (number2 > largest)
            largest = number2;

            if (number3 > largest)
            largest = number3;

            System.out.println("Largest number is " + largest);

        }
    }
}