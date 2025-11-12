import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder string = new StringBuilder();
        StringBuilder stringReverse = new StringBuilder();

        System.out.println("Enter a word:");
        String input = scanner.nextLine();
        System.out.println("You enter: " + input);

        string.append(input);
        stringReverse.append(input);
        stringReverse.reverse();

        System.out.println(string);
        System.out.println(stringReverse);

        if(string.toString().equals(stringReverse.toString()))
            System.out.println("The input String is a Palindrome");
        else
            System.out.println("The input String is not a Palindrome");
    }
}