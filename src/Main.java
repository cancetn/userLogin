import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Patika.dev egitim kampi proje odevidir.

        /*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
         şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         */

        String userName, userPassword, newPassword;

        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanici adinizi giriniz = ");

        userName = inp.nextLine();

        Scanner inp1 = new Scanner(System.in);

        System.out.println("Sifrenizi giriniz = ");

        userPassword = inp1.nextLine();



        if (userName.equals("patika") && userPassword.equals("java101")) {

            System.out.println("Giris yapildi !");

        } else {

            System.out.println("Giris bilgileriniz yanlis");

        }

        String secim;

        Scanner inp2 = new Scanner(System.in);

        secim = inp2.nextLine();

        switch (secim) {
            case "E":
                System.out.println("Yeni sifrenizi giriniz : ");

                Scanner inp3 = new Scanner(System.in);

                newPassword = inp3.nextLine();

                if (newPassword.equals("java101")) {

                    System.out.println("Sifre degistirilemedi. (Eski sifre, yeni sifre ile ayni olamaz");


                } else {
                    System.out.println("Sifre basariyla degistirildi");
                }
                break;
            case "e":
                System.out.println("Yeni sifrenizi giriniz : ");

                Scanner inp4 = new Scanner(System.in);

                newPassword = inp4.nextLine();

                if (newPassword.equals("java101")) {

                    System.out.println("Sifre degistirilemedi. (Eski sifre, yeni sifre ile ayni olamaz");


                } else {
                    System.out.println("Sifre basariyla degistirildi");
                }
                break;
            case "H":
                System.out.println("Sifre degisimi yapmak istemediniz");
                break;
            case "h":
                System.out.println("Sifre degisimi yapmak istemediniz");
                break;
            default:
                System.out.println("Gecersiz secim");


        }
    }
}

