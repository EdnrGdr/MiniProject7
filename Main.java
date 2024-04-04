import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

       /*

        //SwitchCase ile Hesap Mak. Yapma


        Scanner scanner= new Scanner(System.in);

        System.out.println("*********************");

        String islemler = "1. Toplama İşlemi\n"   // \n alt satıra gec demek

                + "2. Çıkarma İşlemi\n"
                + "3. Çarpma İşlemi\n"
                + "4. Bölme İşlemi";

        System.out.println(islemler);

        System.out.println("*********************");

        System.out.println("İşlemi Seçiniz....");
        String islem= scanner.next();



        switch (islem) {

            case"1":
                System.out.print("Birinci Sayı..:");
                int a = scanner.nextInt();
                System.out.print("İkinci Sayı..:");
                int b = scanner.nextInt();
                System.out.println("Girilen Değerlerin Toplam..:" + (a+b));
                break;


            case"2":
                System.out.print("Birinci Sayı..:");
                int c = scanner.nextInt();
                System.out.print("İkinci Sayı..:");
                int d = scanner.nextInt();
                System.out.println("Girilen Değerin Farkları..: " + (c-d));
                break;

            case"3":
                System.out.print("Birinci Sayı..:");
                int e = scanner.nextInt();
                System.out.print("İkinci Sayı..:");
                int f = scanner.nextInt();
                System.out.println("Girilen Değerin Çarpımları..: " + (e*f));
                break;


            case"4":
                System.out.print("Birinci Sayı..:");
                int g = scanner.nextInt();
                System.out.print("İkinci Sayı..:");
                int h = scanner.nextInt();
                System.out.println("Girilen Değerin Bölünmesi..: " + ((double)g/h));
                break;


            default:
                System.out.println("Geçersiz İşlem..");

        }

        */

        // If-else-if ile Yapalım Birde :)


       Scanner scanner= new Scanner(System.in);
       int a;
       int b;

        System.out.println("*********************");
       String islemler =("1. Toplama İşlemi\n"   // \n alt satıra gec demek

                + "2. Çıkarma İşlemi\n"
                + "3. Çarpma İşlemi\n"
                + "4. Bölme İşlemi");

        System.out.println(islemler);

        System.out.println("*********************");

        System.out.println("İşlemi Seçiniz....");
       int islem = scanner.nextInt();



        if ( islem == 1 ) {

            System.out.print("Birinci Sayıyı Giriniz..:");
            a = scanner.nextInt();
            System.out.print("İkinci Sayıyı Giriniz..:");
            b= scanner.nextInt();
            System.out.print("Sonuç..:" + ( a + b));


        } else if ( islem ==2) {

            System.out.print("Birinci Sayıyı Giriniz..:");
            a = scanner.nextInt();
            System.out.print("İkinci Sayıyı Giriniz..:");
            b= scanner.nextInt();
            System.out.print("Sonuç..:" + ( a - b));

        } else if ( islem == 3) {

            System.out.print("Birinci Sayıyı Giriniz..:");
            a = scanner.nextInt();
            System.out.print("İkinci Sayıyı Giriniz..:");
            b= scanner.nextInt();
            System.out.print("Sonuç..:" + ( a * b));

        } else if ( islem == 4) {
            System.out.print("Birinci Sayıyı Giriniz..:");
            a = scanner.nextInt();
            System.out.print("İkinci Sayıyı Giriniz..:");
            b= scanner.nextInt();
            System.out.print("Sonuç..:" + (  (double)a / b));


        } else {

            System.out.println("Geçersiz İşlem....");
        }






    }
}
