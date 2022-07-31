import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        double kilometre;
        double toplamTutar;
        double taksimetreAcilisUcreti = 10;
        double kilometreBasinaTutar = 2.20;

        Scanner inp = new Scanner(System.in);

        System.out.println("Mesafeyi giriniz(km): ");
        kilometre = inp.nextDouble();

        toplamTutar = kilometreBasinaTutar*kilometre + taksimetreAcilisUcreti;

        toplamTutar = toplamTutar > 20 ? toplamTutar : 20;

        System.out.println("Toplam tutar: " + toplamTutar);
    }
}
