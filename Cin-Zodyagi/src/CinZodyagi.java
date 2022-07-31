import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int dogumYili, kalan;
        String mesaj="";

        Scanner sc = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        dogumYili = sc.nextInt();

        kalan = dogumYili % 12;
        switch (kalan){
            case 0:
                mesaj="Maymun";
                break;
            case 1:
                mesaj="Horoz";
                break;
            case 2:
                mesaj="Köpek";
                break;
            case 3:
                mesaj="Domuz";
                break;
            case 4:
                mesaj="Fare";
                break;
            case 5:
                mesaj="Oküz";
                break;
            case 6:
                mesaj="Kaplan";
                break;
            case 7:
                mesaj="Tavsan";
                break;
            case 8:
                mesaj="Ejderha";
                break;
            case 9:
                mesaj="Yılan";
                break;
            case 10:
                mesaj="At";
                break;
            case 11:
                mesaj="Koyun";
                break;
            default:
                System.out.println("Gecersiz deger girdiniz");
        }
        System.out.println("Çin zodyağı burcunuz: " + mesaj);
    }
}
