
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Yıl ve burc değişkenlerimizi tanımladık
        int year;


        //Kullanıcıdan yıl bilgisi aldık
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz : ");
        year = input.nextInt();

        if((year%4==0 && year%100!=0)||year%400==0){ 
            System.out.println("Yıl artık yıldır");
        }
        else{
            System.out.println("yıl artık yıl değildir !");
        }



    }
}