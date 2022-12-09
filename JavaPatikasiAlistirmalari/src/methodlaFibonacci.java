import java.util.Scanner;

public class methodlaFibonacci {

    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        int temp = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen kaçıncı seriye kadar fibonacci değerini bulmak istiyorsanız belirtiniz: ");
        int sayi = input.nextInt();


        for (int i = 1; i <= sayi; i++) {
            System.out.print(n1 + ",");
            temp = n2;
            n2 = n1 + n2;
            n1 = temp;

        }
    }
}
