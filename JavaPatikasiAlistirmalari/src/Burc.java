import java.util.Scanner;
public class Burc {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Burcnuzu Öğrenmek için doğduğunuz ayı rakam olarak girin:");
        int month=input.nextInt();
        System.out.print("günü rakam olarak girin:");
        int day=input.nextInt();

        if (month==1){
            if (day<=21){
                System.out.println("Burcunuz : OĞLAK");
            }else{
                System.out.println(" Burcunuz : KOVA");
            }
        } if (month==2){
            if (day<=19){
                System.out.println("Burcunuz : KOVA");
            }else{
                System.out.println(" Burcunuz : BALIK");
            }
        } if (month==3){
            if (day<=20){
                System.out.println("Burcunuz : BALIK");
            }else{
                System.out.println(" Burcunuz : KOÇ");
            }
        } if (month==4){
            if (day<=20){
                System.out.println("Burcunuz : KOÇ");
            }else{
                System.out.println(" Burcunuz : BOĞA");
            }
        } if (month==5){
            if (day<=21){
                System.out.println("Burcunuz : BOĞA");
            }else{
                System.out.println(" Burcunuz : İKİZLER");
            }
        } if (month==6){
            if (day<=22){
                System.out.println("Burcunuz : İKİZLER");
            }else{
                System.out.println(" Burcunuz : YENGEÇ");
            }
        } if (month==7){
            if (day<=22){
                System.out.println("Burcunuz : YENGEÇ");
            }else{
                System.out.println(" Burcunuz : ASLAN");
            }
        } if (month==8){
            if (day<=22){
                System.out.println("Burcunuz : ASLAN");
            }else{
                System.out.println(" Burcunuz : BAŞAK");
            }
        } if (month==9){
            if (day<=22){
                System.out.println("Burcunuz : BAŞAK");
            }else{
                System.out.println(" Burcunuz : TERAZİ");
            }
        } if (month==10){
            if (day<=22){
                System.out.println("Burcunuz : TERAZİ");
            }else{
                System.out.println(" Burcunuz : AKREP");
            }
        } if (month==11){
            if (day<=21){
                System.out.println("Burcunuz : AKREP");
            }else{
                System.out.println(" Burcunuz : YAY");
            }
        } if (month==12){
            if (day<=21){
                System.out.println("Burcunuz : YAY");
            }else{
                System.out.println(" Burcunuz : OĞLAK");
            }
        }
    }
}
