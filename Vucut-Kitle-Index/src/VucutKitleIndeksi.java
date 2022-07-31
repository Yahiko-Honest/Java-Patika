import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double kilo, boy;
        double vucutKitleIndex;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lutfen boyunuzu (metre cinsinde) giriniz :");
        kilo = inp.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz :");
        boy = inp.nextDouble();

        vucutKitleIndex = kilo / boy * boy;

        System.out.println("Vucut Kitle İndeksiniz :" + vucutKitleIndex);
    }
}
