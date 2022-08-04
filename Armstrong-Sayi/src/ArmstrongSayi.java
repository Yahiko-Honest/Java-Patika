import java.util.Scanner;

public class ArmstrongSayi {
    public static void main(String[] args) {
        int sayi, temp, bNumber;
        int elemanSayisi = 0;
        int sum = 0;
        int usluSonuc = 1;

        Scanner inp = new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");
        sayi = inp.nextInt();

        temp = sayi;
        while (temp > 0)
        {
            temp = temp / 10;
            elemanSayisi++;
        }


        temp = sayi;
        while (temp > 0)
        {
            bNumber = temp%10;
            temp /= 10;

            for (int i = elemanSayisi; i > 0; i--)
            {
                usluSonuc *= bNumber;
            }

            sum += usluSonuc;
            usluSonuc = 1;
        }

        System.out.println("Sayiniz: " + sayi );
        System.out.println("Islem sonucu: " + sum);

        if (sum == sayi)
        {
            System.out.println("Sayiniz armstrong sayidir. ");
        }
        else System.out.println("Sayiniz armstrong sayisi degildir. ");
    }
}
