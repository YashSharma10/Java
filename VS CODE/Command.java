import java.util.Scanner;

public class Command{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Text : ");
        String input = scanner.nextLine();
     

        System.out.println("The entered Text is: " + input);
    }
}