import java.util.Scanner;

public class IkininKuvveti {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz");
        int sayi=sc.nextInt();

        System.out.println( sayi+ " sayısından küçük ikinin kuvvetleri ");

        for (int i=1; i<=sayi; i*=2){
            System.out.println(i);
        }
    }
}
