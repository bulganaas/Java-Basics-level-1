import java.util.Scanner;

public class VacationBooksList4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner -санг ашиглаж болох хувьсагчид утга оноох, оролтын сангаа
        //scanner хувьсагчийг зарласан
        int NumberOfPages = scanner.nextInt();
        int PagesReadIn1Hour= scanner.nextInt();
        int NumberOfDays = scanner.nextInt();
        int numberOfHoursPerDay = (NumberOfPages / PagesReadIn1Hour)/NumberOfDays;
        System.out.println(numberOfHoursPerDay);
    }
}
