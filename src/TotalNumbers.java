import java.util.Scanner;

public class TotalNumbers {
    public static void main(String[] args) {
        //Değişken tanımlama
        int userInput;
        int total=0;

        Scanner input = new Scanner(System.in);

        //kullanıcıdan veri alıp koşulları kontrol eden döngüler
        do {
            System.out.print("Enter Number =");
            userInput=input.nextInt();
            if (userInput%2==0 && userInput%4==0){
                total+=userInput;

            }
        }while (userInput%2==0);

        System.out.println("Çift ve 4'ün katı olan sayıların toplamı = "+total);
    }


}
