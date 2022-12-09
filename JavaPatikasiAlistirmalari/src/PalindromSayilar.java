import java.util.Scanner;

public class PalindromSayilar {


    static boolean isPalindrom(int sayi) {
        int temp = sayi;
        int reverseNumber = 0;
        int lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;

        }
        if (reverseNumber == sayi) {
            return true;
        } else {
            return false;
        }


    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(4));

}}
