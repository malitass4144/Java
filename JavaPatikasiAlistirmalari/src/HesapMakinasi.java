import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen işlem yapmak istediğiniz ilk numarayı giriniz:");
        int number1 = input.nextInt();
        System.out.println("Lütfen işlem yapmak istediğiniz ikinci numarayı giriniz:");
        int number2 = input.nextInt();
        System.out.println("Yapmak istediğiniz işlemi seçiniz\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        int select = input.nextInt();
        if (select == 1) {
            System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
        } else if (select == 2) {
            System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));

        } else if (select == 3) {
            System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));

        } else if (select == 4) {
            if (number2 != 0) {
                System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
            } else {
                System.out.println("Hatalı bir giriş yaptınız!Bir sayı 0 a bölünemz");
            }
        } else {
            System.out.println(" Hatalı bir giriş yaptınız ");
        }

    }
}
