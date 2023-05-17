import java.util.Scanner;

public class AverageOfNumbers {
    //kullanıcının girdiği sayıya kadar çift sayıkarı yazan program
    public static void main(String[] args) {
        //Değişken Tanımı
        int userInput  ;
        int sum=0;
        int count=0;


        //Kullanıcıdan veri alma
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Number :");
        userInput=inp.nextInt();


        for (int i = 0 ; i<=userInput;i++){
            if (i%4==0 && i%3==0){
                sum+=i;
                count++;

            }
        }

        if (count>0){
            double average =sum/count;
            System.out.println("3 ve 4 e tam bölünen sayıların ortalaması : "+average);
        }else {
            System.out.println("3 ve 4 e tam bölünen sayı bulunamadı ");
        }
    }

}
