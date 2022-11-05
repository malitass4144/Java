import  java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println(" please enter price of product");
        double price=input.nextDouble();
        System.out.println(" enter tax rate ");
        double taxRate=input.nextDouble();
        double priceWithTax=price+(price*taxRate/100);
        double taxPrice=(int)((priceWithTax-price)*100)/100.0;

        System.out.println("Price without tax : "+price);
        System.out.println("Price with tax : "+priceWithTax);
        System.out.println("Tax price: "+taxPrice);
    }
}
