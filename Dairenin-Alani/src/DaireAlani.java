import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {
        double pi = 3.14;
        double r;
        double aci;
        double alan;

        Scanner inp = new Scanner(System.in);

        System.out.println("Yaricapi ve merkez acisinin olcusunu giriniz: ");
        r = inp.nextDouble();
        aci = inp.nextDouble();

        alan = (pi * (r*r) * aci) / 360;

        System.out.println("Dairenin diliminin alani: " + alan);
    }
}
