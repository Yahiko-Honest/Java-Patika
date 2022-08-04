import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {
        int n;
        double sum = 0;
        double bolum;

        Scanner inp = new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");
        n = inp.nextInt();

        for (double i = 1; i <= n; i++)
        {
            bolum = 1/i;
            sum += bolum;
        }

        System.out.println("Harmonik serisi: " + sum);

    }
}
