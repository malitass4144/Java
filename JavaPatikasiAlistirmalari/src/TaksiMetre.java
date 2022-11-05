import java.util.Scanner;
public class TaksiMetre {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int baslangicFiyati=10;
        System.out.println(" Gitmek istediğiniz yerin mesafe cinsinden uzaklığını giriniz");
        double mesafe=input.nextDouble();
        double pricePerKilometer=2.20;
        double taxiPrice=baslangicFiyati+(mesafe*pricePerKilometer);
        String str= taxiPrice<=20 ?"Ücret :20 TL":" Ücretiniz : "+taxiPrice+"TL";
        System.out.println(str);
    }
}
