import java.util.Scanner; //дэлгэцнээс уншиж авах scanner Санг дуудаж  оруулж байна

public class projectsCreation07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner -санг ашиглаж болох хувьсагчид утга оноох, оролтын сангаа
        //scanner хувьсагчийг зарласан
        String name = scanner.nextLine();
        //int projectCount = scanner.nextInt(); //int авна
        int projectCount = Integer.parseInt(scanner.nextLine()); //string int хөрвүүлнэ
        //1. тухайн  хувьсагч дотор давхар утга агуулахыг илэрхийлнэ
        //2, Хэрвээ тухайн хувьсагч нэг үг болвол жижиг, харин 2 дээш үг байвал 2 дахь үгийг томоор бичнэ
        int totalHour = 3 * projectCount;

        // System.out.println("The architect "+ name +
        //        " will need "+ totalHour +" hours to complete " +
        //    "" + projectCount + " project/s.");
        System.out.printf("The architect %s " +
                "will need %d hours to complete " +
                "%d project/s.", name, totalHour, projectCount);
        //System.out.println("A"); //A хэвлээд доошоогоо нэг мөр авна
        //A

        //System.out.print("A");//A хэвлээд ямар нэг мөр авахгүй
        //A
       // System.out.printf("%s,%d,%d", name,totalHour,projectCount);//A хэвлээд ямар нэг мөр авахгүй, %s -гаднаас стринг төрлийн аваад
          //  Bulgan,27,9   //текстийн дунд нь юм оруулах гэж байгаа бол printf %s ашиглавал автоматаар текстийн зайг засна.
   // %s - параметр
        //System.out.println("Name: " + name + " Total hour: + totalHour);
        //System.out.printf("Name: %s Total hour: %d", name, totalHour);

        //System.out.print("Name: ");
        //System.out.print(name);
        //System.out.print("Total hour: ");
        //System.out.print(totalHour); - 3уулаа адил үрдүнтэй, юу хэвлэж харуулах гэж байгаагаа хамааруулаад print сонгоно
    }
}
