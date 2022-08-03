import java.util.Scanner;

public class KombinasyonFormulu {
    public static void main(String[] args) {
        int n, r, c;
        int nFaktoriyel = 1, rFaktoriyel = 1, nEksirFaktoriyelFaktoriyel = 1;

        Scanner inp = new Scanner(System.in);

        System.out.println("Faktoriyel sayisini(n) ve kombinasyon sayisini giriniz: ");
        n = inp.nextInt();
        r = inp.nextInt();

        for (int i = n; i > 0; i--)
        {
            nFaktoriyel *= i;
        }
        System.out.println("Faktoriyel sonucu: " + nFaktoriyel + "\n");

        for (int i = r; i > 0; i--)
        {
            rFaktoriyel *= i;
        }

        for (int i = n - r; i > 0; i--)
        {
            nEksirFaktoriyelFaktoriyel *= i;
        }

        c = nFaktoriyel/(rFaktoriyel*nEksirFaktoriyelFaktoriyel);
        System.out.println("Kombinasyon sonucu: " + c);
    }
}
