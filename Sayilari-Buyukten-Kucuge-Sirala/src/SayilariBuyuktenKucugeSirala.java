import java.util.Scanner;

public class SayilariBuyuktenKucugeSirala {
    public static void main(String[] args) {

        int sayi1, sayi2, sayi3;
        Scanner sc=new Scanner(System.in);

        System.out.println("Lütfen Üç Farlı Sayı Girinizi");

        sayi1=sc.nextInt();
        sayi2=sc.nextInt();
        sayi3=sc.nextInt();

        if (sayi1 > sayi2 && sayi1 > sayi3) {
            if (sayi2 >sayi3) {
                System.out.println( sayi1 +" > " + sayi2 +" > "+ sayi3 );
            } else{
                System.out.println(sayi1 +" > " + sayi3+" > "+ sayi2);
            }
        } else if (sayi2 > sayi1 && sayi2> sayi3) {
            if (sayi1 > sayi3) {
                System.out.println(sayi2 + " > " + sayi1 + " > " + sayi3);
            } else {
                System.out.println(sayi2 + " > " + sayi3 + " > " + sayi1);
            }
        }else{
            if (sayi1 > sayi2) {
                System.out.println(sayi3 + " > " + sayi1 + " > " + sayi2);
            } else {
                System.out.println(sayi3 + " > " + sayi2 + " > " + sayi1);
            }
        }
    }
}
