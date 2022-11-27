import java.util.Scanner;

public class HarmonikSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int number = input.nextInt();
        double total = 0;
        for (int i = 1; i <= number; i++) {
            total += (1.0 / i);
        }
        System.out.println(number + " 'a kadar olan sayıların harmonik toplamları : " + total);
    }

}
