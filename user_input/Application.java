import java.util.Scanner;

public class Application{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a line of text: ");
        String line = input.nextLine();
        System.out.println("You entered line: " + line);

        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println("You entered the number: " + number);

    }
}