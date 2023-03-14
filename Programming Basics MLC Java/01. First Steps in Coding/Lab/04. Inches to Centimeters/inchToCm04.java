import java.util.Scanner;

public class inchToCm04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner -санг ашиглаж болох хувьсагчид утга оноох, оролтын сангаа
        //scanner хувьсагчийг зарласан
        double inches = Double.parseDouble(scanner.nextLine());
        double centimeters = inches * 2.54;
        System.out.println(centimeters);
    }
}

