import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        int girilenSayi, sayac=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı Giriniz");
        girilenSayi=sc.nextInt();

        while (sayac<=girilenSayi){
            if (sayac%2==0){
                System.out.println(sayac);
            }
            sayac++;
        }
    }
}
