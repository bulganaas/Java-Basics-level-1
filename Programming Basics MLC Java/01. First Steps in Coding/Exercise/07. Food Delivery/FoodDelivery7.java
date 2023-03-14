import java.util.Scanner;

public class FoodDelivery7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner -санг ашиглаж болох хувьсагчид утга оноох, оролтын сангаа
        //scanner хувьсагчийг зарласан
        double NumberOfChickenMenus = scanner.nextDouble();
        double NumberOfFishMenus = scanner.nextDouble();
        double NumberOfVegetarianMenus = scanner.nextDouble();
        double ChickenMenu = 10.35;
        double FishMenu = 12.40;
        double VegetarianMenu = 8.15;
        double DeliveryPrice = 2.50;
        double PriceForChickenMenus = NumberOfChickenMenus * ChickenMenu;
        double PriceForFishMenus = NumberOfFishMenus * FishMenu;
        double PriceForVegetarianMenus = NumberOfVegetarianMenus * VegetarianMenu;
        double TotalPriceOfMenus = PriceForChickenMenus + PriceForFishMenus + PriceForVegetarianMenus;
        double DessertPrice = TotalPriceOfMenus * 0.20;
        double TotalPriceOfOrder = TotalPriceOfMenus + DessertPrice + DeliveryPrice;
        System.out.println(TotalPriceOfOrder);
    }
}
