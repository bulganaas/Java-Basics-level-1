import java.util.Scanner;

public class greetingsByName05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        //  System.out.print("Hello, ");
        //   System.out.print(name);  - шууд дараалж бичнэ
        //   System.out.print("!");

        System.out.println("Hello, " + name + "!");//println хэвлэсний дараа шинэ мөр авна
    }
}
