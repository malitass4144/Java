import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        int number = input.nextInt();
        int add=0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                add +=i;
            }
        }if (add==number){
            System.out.println("Girdiğiniz "+number+" sayısı bir mükemmel sayıdır.");
        }else {
            System.out.println("Girdiğiniz "+number+" sayısı bir mükemmel sayı değildir.");
        }
    }
}
