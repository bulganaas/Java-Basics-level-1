import java.util.Scanner;

public class RadiansToDegrees2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner -санг ашиглаж болох хувьсагчид утга оноох, оролтын сангаа
        //scanner хувьсагчийг зарласан
        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 180/Math.PI;
        System.out.println(degrees);

    }
}