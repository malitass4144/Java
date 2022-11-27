import java.util.Scanner;
public class AsalSayiiiii {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("bir sayı gir: ");
        int sayi=input.nextInt();
        if (sayi==2){
            System.out.println("asal sayıdır");

        } else if (sayi%2==0 && sayi>2) {
            System.out.println("asal değil");

        }else {
            for (int i=3;i<sayi;i+=2){
                if (sayi%i==0){
                    System.out.println("asal değil"+sayi);
                    break;
                }else {
                    System.out.println("asaldır"+sayi);

                }
            }
        }

        //1- bir sayı belirle
        // 2-sayı ikiden büyük çift ise asal değil  if kısmı
        //3-for döngüsü belirlenen sayıya kadar 3 ten başlasın else içerisinde
        //4- for döngüsündeki her i değeri bu sayıyı böler mi ?
        //5- herhangibiri bölerse döngüden çık asal değil yazdır



    }
}
