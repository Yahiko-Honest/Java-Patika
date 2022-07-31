import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, muzik;
        int toplam;
        float ortalama;

        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik notunuz: ");
        matematik = inp.nextInt();
        System.out.println("Fizik notunuz: ");
        fizik = inp.nextInt();
        System.out.println("Kimya notunuz: ");
        kimya = inp.nextInt();
        System.out.println("Turkce notunuz: ");
        turkce = inp.nextInt();
        System.out.println("Muzik notunuz: ");
        muzik = inp.nextInt();

        toplam = matematik + fizik + kimya + turkce + muzik;
        ortalama = toplam/5;

        System.out.println("Ortalamaniz: " + ortalama);

        if (ortalama > 0 && ortalama < 55)
        {
            System.out.println("Kaldiniz.");
        } else if (ortalama >= 55 && ortalama <= 100)
        {
            System.out.println(" Gectiniz.");
        }
        else System.out.println("Gecersiz deger.");
    }
}
