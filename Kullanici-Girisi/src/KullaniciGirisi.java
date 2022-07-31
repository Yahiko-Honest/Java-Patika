import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        String userName, password;
        String userTName = "Patika";
        String userTPassword = "java123";
        String newUsername, newPassword;
        char secim;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanici adi giriniz: ");
        userName = inp.nextLine();
        System.out.println("Sifre giriniz: ");
        password = inp.nextLine();

        if (userName.equals(userTName) && password.equals(userTPassword))
        {
            System.out.println("Sisteme giris yapildi.");
        }
        else if (!(userName.equals(userTName)))
        {
            System.out.println("Kullanici adi hatali.");
            System.out.println("Kullanici adinizi sifirlamak ister misiniz?(y/n)");
            secim = inp.next().charAt(0);

            switch (secim)
            {
                case 'y':

                    System.out.println("Yeni kullanici adi giriniz: ");
                    inp.nextLine();
                    newUsername = inp.nextLine();
                    if (newUsername.equals(userTName))
                    {
                        System.out.println("Kullanici adi olusturulamadi.");
                    }
                    else
                    {
                        userTName = newUsername;
                        System.out.println("Kullanici adi basariyla degistirildi.");
                    }
                    break;
                case 'n':
                    System.out.println("Kullanici adi olusturulamadi. ");
                    break;
            }

        }
        else if (!(password.equals(userTPassword)))
        {
            System.out.println("Sifre adi hatali.");
            System.out.println("Sifrenizi sifirlamak ister misiniz?(y/n)");
            secim = inp.next().charAt(0);

            switch (secim)
            {
                case 'y':
                    System.out.println("Yeni sifrenizi giriniz: ");
                    inp.nextLine();
                    newPassword = inp.nextLine();
                    if (newPassword.equals(password))
                    {
                        System.out.println("Sifre olusturulamadi.");
                    }
                    else
                    {
                        userTPassword = newPassword;
                        System.out.println("Sifre basariyla degistirildi.");
                    }
                    break;
                case 'n':
                    System.out.println("Sifre olusturulamadi. ");
                    break;
            }

        }
    }
}
