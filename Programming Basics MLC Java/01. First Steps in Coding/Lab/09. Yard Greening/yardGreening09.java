import java.util.Scanner;

public class yardGreening09 {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double SquareMetersOfLandscaped = scanner.nextDouble();
        double firstPrice = 7.61*SquareMetersOfLandscaped;
        double discount = firstPrice * 0.18;

        System.out.printf("The final price is: %.2f USD.%n", firstPrice-discount);
        System.out.printf("The discount is: %.2f USD.", discount);
    }
}
