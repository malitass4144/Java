import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int toplam = 0;
        do {
            System.out.println("Lütfen bir sayı giriniz:");
            number = input.nextInt();
            if (number % 2 == 1) {
                toplam += number;
            }
        } while (number > 0);

        System.out.println("Toplam : " + toplam);
    }
}
