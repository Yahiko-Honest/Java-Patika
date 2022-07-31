import java.util.Scanner;
import java.lang.Math;

public class UcgenAlani {
    public static void main(String[] args) {
        int a,b,c;
        int alanKaresi;
        int cevre;
        int u;

        Scanner inp = new Scanner(System.in);

        System.out.println("Uc kenar giriniz: ");
        a = inp.nextInt();
        b = inp.nextInt();
        c = inp.nextInt();

        u = (a+b+c) / 2;
        alanKaresi = u * (u - a) * (u - b) * (u - c);

        System.out.println("Ucgenin alani: " + Math.sqrt(alanKaresi));
    }
}
