import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
         /* System.out.println("Lütfen üssünü hesaplamak istediğiniz sayıyı giriniz: ");
            int number = input.nextInt();
            System.out.println("Lütfen üssü giriniz : ");
            int pow = input.nextInt();

            int total = (int) (Math.pow(number, pow));
            System.out.println(number + " sayısının " + pow + ". dereceden üssünün sonucu : " + total + " dır. ");*/

        Scanner input = new Scanner(System.in);

        int number, pow;

        System.out.println("Lütfen üssünü hesaplamak istediğiniz sayıyı giriniz: ");
        number = input.nextInt();
        System.out.println("Lütfen üssü giriniz : ");
         pow = input.nextInt();
        int total=1;

        int i=1;
        while(i<=pow){
            total*=number;
            i++;
        }

        System.out.println("Cevap : "+total);
    }
}
