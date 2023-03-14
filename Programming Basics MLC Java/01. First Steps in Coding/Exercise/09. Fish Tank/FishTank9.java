import java.util.Scanner;

public class FishTank9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner -санг ашиглаж болох хувьсагчид утга оноох, оролтын сангаа
        //scanner хувьсагчийг зарласан
        int Length = Integer.parseInt(scanner.nextLine());
        int Width = Integer.parseInt(scanner.nextLine());
        int Height = Integer.parseInt(scanner.nextLine());
        double Percentage = scanner.nextDouble();
        double VolumeOfAquarium = Length * Width*Height;//cm3
        double VolumeInLiters = VolumeOfAquarium/1000;//liter
        double OccupiedSpace = Percentage / 100;
        double RequiredLiters = VolumeInLiters * (1 - OccupiedSpace);
        System.out.println(RequiredLiters);
    }
}
