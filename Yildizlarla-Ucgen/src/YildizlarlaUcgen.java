import java.util.Scanner;

public class YildizlarlaUcgen {
    public static void main(String[] args) {

        int n;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayi giriniz: ");
        n = inp.nextInt();

        for (int i = 0; i <= n; i++)
        {
            for (int j = 0; j < (n - i); j++)
            {
                System.out.printf(" ");
            }

            for (int j = 1; j < 2*(i + 1); j++)
            {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }


        for (int i = n-1; i >= 0; i--)
        {
            for (int j = 0; j < (n - i); j++)
            {
                System.out.printf(" ");
            }

            for (int j = 1; j < 2*(i + 1); j++)
            {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
