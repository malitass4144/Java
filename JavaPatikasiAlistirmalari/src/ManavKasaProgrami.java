import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double armutFiyat=2.14;
        double elmaFiyat=3.67;
        double domatesFiyat=1.11;
        double muzFiyat=0.95;
        double patlicanFiyat=5.00;
        System.out.print("Kaç kg armut aldınız ? ");
        double armutKg=input.nextDouble();

        System.out.print("Kaç kg elma aldınız ? ");
        double elmaKg=input.nextDouble();

        System.out.print("Kaç kg domates aldınız ? ");
        double domatesKg=input.nextDouble();

        System.out.print("Kaç kg muz aldınız ? ");
        double muzKg=input.nextDouble();

        System.out.print("Kaç kg patlican aldınız ? ");
        double patlicanKg=input.nextDouble();

        double priceOfArmut=(int)(armutKg*armutFiyat*100)/100.0;
        double priceOfElma=(int)(elmaKg*elmaFiyat*100)/100.0;
        double priceOfDomates=(int)(domatesKg*domatesFiyat*100)/100.0;
        double priceOfMuz=(int)(muzKg*muzFiyat*100)/100.0;
        double priceOfPatlican=(int)(patlicanKg*patlicanFiyat*100)/100.0;

        double total=(int)((priceOfArmut+priceOfElma+priceOfDomates+priceOfMuz+priceOfPatlican)*100)/100.0;

        System.out.println("price of armut: "+priceOfArmut);
        System.out.println("price of elma: "+priceOfElma);
        System.out.println("price of domates: "+priceOfDomates);
        System.out.println("price of muz: "+priceOfMuz);
        System.out.println("price of patlican: "+priceOfPatlican);
        System.out.println("total price: "+total);
    }
}
