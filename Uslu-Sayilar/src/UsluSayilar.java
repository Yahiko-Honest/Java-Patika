import java.util.Scanner;

public class UsluSayilar {
    public static void main(String[] args) {
        int sayi, ussu, sonuc = 1;

        Scanner inp = new Scanner(System.in);

        System.out.println("Sayiyi giriniz: ");
        sayi = inp.nextInt();
        System.out.println("Ussu giriniz: ");
        ussu = inp.nextInt();

        while (ussu > 0)
        {
            sonuc *= sayi;
            ussu--;
        }

        System.out.println("Ussu sonucu: " + sonuc);
    }
}
