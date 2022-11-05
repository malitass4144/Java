import java.util.Scanner;
public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("LÜtfen boyunuzu metre cinsinden giriniz: ");
        double length=input.nextDouble();
        System.out.println("Lütfen kilonuzu kilogram cinsinden giriniz: ");
        double weight=input.nextDouble();
        double bodyMassIndex=(int)(weight/(length*length)*100)/100.0;

        System.out.println("Vücut Kitle endeksiniz: "+bodyMassIndex);
    }
}
