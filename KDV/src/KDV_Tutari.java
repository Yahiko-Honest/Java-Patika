import java.util.Scanner;

public class KDV_Tutari {
    public static void main(String[] args) {
        float tutar;
        float kdvOran;
        float kdvTutar;
        float kdvliTutar;
        boolean kdvDurumu;

        Scanner inp = new Scanner(System.in);
        System.out.print("Tutar Giriniz: ");
        tutar = inp.nextFloat();

        kdvDurumu=(0<tutar) && (tutar<1000);
        kdvOran = kdvDurumu ? 0.18f: 0.08f;

        kdvTutar=tutar*kdvOran;
        kdvliTutar=kdvTutar+tutar;

        System.out.println("KDV'siz Tutar: "+tutar);
        System.out.println("KDV orani: "+kdvOran);
        System.out.println("KDV Tutari: "+kdvTutar);
        System.out.println("KDV'li Tutari: "+kdvliTutar);
    }

}
