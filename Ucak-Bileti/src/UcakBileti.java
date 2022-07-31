import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        double biletFiyati = 0.0, mesafe, mesafeBasiUcret=0.10;
        int yas, yolculukTipi;
        boolean hata=false;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Mesafeyi Giriniz (Km) : ");
        mesafe = sc.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        yas = sc.nextInt();

        System.out.print("Yolculuk Tipini Giriniz (Tek Yön için: 1, Gidiş Dönüş için: 2): ");
        yolculukTipi = sc.nextInt();

        biletFiyati=mesafe*mesafeBasiUcret;
        
        switch (yolculukTipi){
            case 1:
                biletFiyati= biletFiyati;
                break;
            case 2:
                // Gidiş-Dönüş iki bilet olacağı için 2 ile çarpıldı ve %20 ((1-0.2)= 0.8) uygulandı.
                biletFiyati*=2*0.8;
                break;
            default:
                hata=true;
        }

        if (!hata){
            if (0<yas && yas<12){
                biletFiyati*=0.5;
                System.out.println("Bilet fiyatınız: " + biletFiyati+" TL");
            } else if (12<=yas && yas<24) {
                biletFiyati*=0.9;
                System.out.println("Bilet fiyatınız: " + biletFiyati+" TL");
            } else if (24<=yas && yas<65) {
                biletFiyati=biletFiyati;
                System.out.println("Bilet fiyatınız: " + biletFiyati+" TL");
            }else if (yas>65) {
                biletFiyati*=0.7;
                System.out.println("Bilet fiyatınız: " + biletFiyati+" TL");
            }else {
                System.out.println("Hatalı giris");
            }
        }else {
            System.out.println("Hatalı giris yaptiniz");
        }
    }
}
