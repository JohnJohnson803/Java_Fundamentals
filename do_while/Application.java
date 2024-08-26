import java.util.Scanner;

public class  Application{
    public static void main(String[] args)
    {
        int value;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Enter a number: ");
            value = scanner.nextInt();

        }while(value != 5);

        System.out.println("Application Closing");
    }
}