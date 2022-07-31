import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {

        int sicaklik;
        Scanner sc=new Scanner(System.in);
        System.out.println("Sıcaklık değerini giriniz");
        sicaklik=sc.nextInt();

        String durum= (sicaklik<5) ? "Kayak yapabilirsiniz" : ( (5<=sicaklik && sicaklik<15) ? "Sinemaya gidebilirsiniz":( (15<=sicaklik && sicaklik<25) ? "Piknige gidebilirsiniz":"Yüzmeye gidebilirsiniz"));

        System.out.println(durum);
    }
}
