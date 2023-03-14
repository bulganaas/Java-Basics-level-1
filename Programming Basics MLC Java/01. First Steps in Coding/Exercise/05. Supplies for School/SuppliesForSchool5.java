import java.util.Scanner;

public class SuppliesForSchool5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner -санг ашиглаж болох хувьсагчид утга оноох, оролтын сангаа
        //scanner хувьсагчийг зарласан
        double PackageOfPens = scanner.nextDouble();
        double PackageOfMarkers= scanner.nextDouble();
        double LitersOfDetergent = scanner.nextDouble();
        double PercentageReduction = scanner.nextDouble();
        double PackageOfPensPrice = 5.80;
        double PackageOfMarkersPrice = 7.20;
        double LitersOfDetergentPrice = 1.20;
        double PriceOfPackagesOfPens = PackageOfPens*PackageOfPensPrice;
        double PriceOfPackagesOfMarkers = PackageOfMarkers*PackageOfMarkersPrice;
        double PriceOfDetergents = LitersOfDetergent*LitersOfDetergentPrice;
        double newDiscount = PercentageReduction/100;
        double PriceForAllProducts = PriceOfPackagesOfPens+PriceOfPackagesOfMarkers+PriceOfDetergents;
        double PriceWithDiscount = PriceForAllProducts-(PriceForAllProducts*newDiscount);
        System.out.println(PriceWithDiscount);

    }
}
