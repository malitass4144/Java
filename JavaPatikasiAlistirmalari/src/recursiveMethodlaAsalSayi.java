/*asal olmayan sayı olmayanı gösterip yazabiliyorum fakat asıl sayıyı yazamıyorum*/


import java.util.Scanner;

public class recursiveMethodlaAsalSayi {

    static int asalSayi(int sayi) {
        boolean isPrime=true;
        if (sayi == 2)
            System.out.println(sayi + " Bir asal sayıdır . ");
        else {
            for (int i = 3; i < sayi; i += 2) {
                if (sayi%i==0){
                    System.out.println(sayi+" Sayısı bir asal sayı değildir");
                    break;
                }

                }
            }
        return sayi;
        }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi=input.nextInt();
        asalSayi(sayi);
    }

}
