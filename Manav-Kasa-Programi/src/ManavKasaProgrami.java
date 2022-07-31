import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {

        double armutKatsayi = 2.14;
        double elmaKatsayi = 3.67;
        double domatesKatsayi = 1.11;
        double muzKatsayi = 0.95;
        double patlicanKatsayi = 5.00;
        double armut, elma, domates, muz, patlican;
        double sum;

        Scanner inp = new Scanner(System.in);

        System.out.println("Armut Kac Kilo");
        armut = inp.nextDouble();

        System.out.println("Elma Kac Kilo");
        elma = inp.nextDouble();

        System.out.println("Domates Kac Kilo");
        domates = inp.nextDouble();

        System.out.println("Muz Kac Kilo");
        muz = inp.nextDouble();

        System.out.println("Patlican Kac Kilo");
        patlican = inp.nextDouble();

        sum = (armut * armutKatsayi) + (elma * elmaKatsayi) + (domates * domatesKatsayi) + (muz * muzKatsayi) + (patlican * patlicanKatsayi);

        System.out.println("Toplam Tutar: " + sum);
    }
}
