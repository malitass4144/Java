import java.util.Scanner;

public class ArmstrongSayisiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k = 1;
        while (k > 0) {
            System.out.println("Lütfen bir sayı giriniz : ");

            int number = input.nextInt();
            int basNumber = 0;
            int tempNumber = number;
            int basValue;
            int basPow;
            int result = 0;
            while (tempNumber != 0) {
                tempNumber /= 10;
                basNumber++;
            }
            tempNumber = number;
            while (tempNumber != 0) {
                basValue = tempNumber % 10;
                basPow = 1;
                for (int i = 1; i <= basNumber; i++) {
                    basPow *= basValue;

                }
                tempNumber /= 10;
                result += basPow;

            }
            if (result == number) {
                System.out.println(number + " sayısı bir amstrog sayıdır");
            } else {
                System.out.println(number + " sayısı bir amstrog sayı değildir.");
            }
        }
    }
}
