import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
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
        System.out.println("Tarih notunuz: ");
        tarih = inp.nextInt();
        System.out.println("Muzik notunuz: ");
        muzik = inp.nextInt();

        toplam = matematik + fizik + kimya + turkce + tarih + muzik;
        ortalama = toplam/6;

        System.out.println("Ortalamaniz: " + ortalama);

        boolean check = ortalama >= 60;
        String sonuc = check ? "Sinifi geçti" : "Sinifta kaldi";
        System.out.println(sonuc);


    }
}
