import java.util.Scanner;

public class concatenateData06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstname = scanner.nextLine();
        String lastname = scanner.nextLine();
        String age = scanner.nextLine();
        String city = scanner.nextLine();
        String str = "You are " + firstname + " " + lastname + ", a " + age + "-years old person from " + city + ".";
        //String s= age + " @" + firstname + "_";
        System.out.println(str);//println хэвлэсний дараа шинэ мөр авна
    }
} //You are Maria Ivanova, a 19-years old person from Pleven.