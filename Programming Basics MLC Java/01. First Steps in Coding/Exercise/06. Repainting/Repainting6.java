import java.util.Scanner;

public class Repainting6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner -санг ашиглаж болох хувьсагчид утга оноох, оролтын сангаа
        //scanner хувьсагчийг зарласан
        double RequiredAmountOfNylon = scanner.nextDouble();
        double RequiredAmountOfPaint = scanner.nextDouble();
        double QuantityOfDetergent = scanner.nextDouble();
        double HoursForWorkers = scanner.nextDouble();
        double ProtectiveNylon = 1.50;
        double Paint = 14.50;
        double PaintThinner = 5.00;
        double SumForNylon = (RequiredAmountOfNylon+2)*ProtectiveNylon;
        double SumForPaint = (RequiredAmountOfPaint+(RequiredAmountOfPaint*0.1))*Paint;
        double SumForDetergent = QuantityOfDetergent*PaintThinner;
        double SumForBags = 0.40;
        double TotalSumForMaterials = SumForNylon+SumForPaint+SumForDetergent+SumForBags;
        double SumForWorkers=(TotalSumForMaterials*30/100)*HoursForWorkers;
        double TotalSum=TotalSumForMaterials+SumForWorkers;
        System.out.println(TotalSum);
    }
}
