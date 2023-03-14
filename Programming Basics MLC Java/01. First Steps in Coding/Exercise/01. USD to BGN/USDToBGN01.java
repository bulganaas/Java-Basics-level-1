import java.util.Scanner;

public class USDToBGN01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner -санг ашиглаж болох хувьсагчид утга оноох, оролтын сангаа
        //scanner хувьсагчийг зарласан
        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.79549;
        System.out.println(bgn);
    }
}
