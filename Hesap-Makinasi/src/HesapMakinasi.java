import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        int sayi_1, sayi_2;
        char operator;

        Scanner inp = new Scanner(System.in);

        System.out.println("Iki sayi giriniz: ");
        sayi_1 = inp.nextInt();
        sayi_2 = inp.nextInt();

        System.out.println("Operator giriniz: ");
        operator = inp.next().charAt(0);

        switch (operator)
        {
            case '+':
                System.out.println("Sonuc: " + (sayi_1 + sayi_2));
                break;
            case '-':
                System.out.println("Sonuc: " + (sayi_1 - sayi_2));
                break;
            case '*':
                System.out.println("Sonuc: " + (sayi_1 * sayi_2));
                break;
            case '/':
                System.out.println("Sonuc: " + (sayi_1 / sayi_2));
                break;
            default:
                System.out.println("Gecersiz operator!");
                break;
        }
    }
}
