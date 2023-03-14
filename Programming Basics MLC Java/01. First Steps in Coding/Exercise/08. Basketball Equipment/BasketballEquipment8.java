import java.util.Scanner;

public class BasketballEquipment8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner -санг ашиглаж болох хувьсагчид утга оноох, оролтын сангаа
        //scanner хувьсагчийг зарласан
        double AnnualFeeForBasketballTraining = scanner.nextDouble();
        double PriceOfBasketballSneakers = AnnualFeeForBasketballTraining - (AnnualFeeForBasketballTraining * 0.40);
        double BasketballOutfit = PriceOfBasketballSneakers - (PriceOfBasketballSneakers * 0.20);
        double PriceOfBall = BasketballOutfit * 0.25;
        double PriceOfBasketballAccessories = PriceOfBall * 0.20;
        double TotalPriceForEquipment = AnnualFeeForBasketballTraining + PriceOfBasketballSneakers + BasketballOutfit + PriceOfBall + PriceOfBasketballAccessories;
        System.out.println(TotalPriceForEquipment);


    }
}
