import java.util.Scanner;

public class petShop08 {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numberOfDogFood = Integer.parseInt(scanner.nextLine());
        int numberOfCatFood = Integer.parseInt(scanner.nextLine());

        System.out.printf("%,.1f USD.", (numberOfCatFood*4)+(numberOfDogFood*2.5));
    }
}
