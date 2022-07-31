import java.util.Scanner;

public class TekSayiToplami {
    public static void main(String[] args) {

        int sayi ,toplam=0;
        Scanner input= new Scanner(System.in);

        do {
            System.out.println("Lutfen bir sayi giriniz:");
            sayi=input.nextInt();
            if(sayi%4 == 0){
                toplam += sayi;
            }


        }
        while (sayi%2==0 );
        System.out.println("Girdiginiz sayilarin toplami (tek sayi haric): " + toplam);
    }
}
