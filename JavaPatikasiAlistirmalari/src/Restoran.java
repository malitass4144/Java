import java.util.Scanner;

public class Restoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       //yiyecekler
        int etDoner = 40;
        int tavukDoner = 30;
        int corba = 20;
        int salata = 10;
        int kuruPilav = 40;
        int pide = 25;

        //içecekler

        int ayran = 5;
        int kola = 10;
        int su = 2;
        int cay = 2;
        int fanta = 10;
        int soda = 3;

     /*   System.out.println(" Aşağıdaki menümüzden neler almak istersiniz ?");

        System.out.println(" ** 1-ET DÖNER:40TL     ** 7-AYRAN:5TL");
        System.out.println(" ** 2-TAVUK DÖNER :30TL ** 8-KOLA:10TL");
        System.out.println(" ** 3-ÇORBA:20TL        ** 9-SU:2TL");
        System.out.println(" ** 4-SALATA:10TL       ** 10-ÇAY:2TL");
        System.out.println(" ** 5-KURU PİLAV:40TL   ** 11-FANTA:10TL");
        System.out.println(" ** 6-PİDE:25TL         ** 12-SODA:3TL");
        System.out.println("                                       ");
        System.out.print(" Lütfen istediğiniz ürünün numarasını menüden seçiniz ");
        int urun = input.nextInt();
        System.out.print(" Kaç porsiyon istediğinizi belirtin");
        int porsiyon = input.nextInt();
        System.out.println("Eğer birşey istemiyorsanız 0 tuşuna basınız");
        int tutar = urun * porsiyon;  */

        int extra=1;
        int tutar = 0;
        //int toplamTutar=0;

        while (extra != 0) {


            System.out.println(" Aşağıdaki menümüzden neler almak istersiniz ?");

            System.out.println(" ** 1-ET DÖNER:40TL     ** 7-AYRAN:5TL");
            System.out.println(" ** 2-TAVUK DÖNER :30TL ** 8-KOLA:10TL");
            System.out.println(" ** 3-ÇORBA:20TL        ** 9-SU:2TL");
            System.out.println(" ** 4-SALATA:10TL       ** 10-ÇAY:2TL");
            System.out.println(" ** 5-KURU PİLAV:40TL   ** 11-FANTA:10TL");
            System.out.println(" ** 6-PİDE:25TL         ** 12-SODA:3TL");
            System.out.println("                                       ");
            System.out.print(" Lütfen istediğiniz ürünün numarasını menüden seçiniz: ");
            int urun = input.nextInt();
            System.out.print(" Kaç porsiyon istediğinizi belirtin");
            int porsiyon = input.nextInt();




            switch (urun) {
                case 1:
                    tutar += etDoner * porsiyon;
                    break;
                case 2:
                    tutar += tavukDoner * porsiyon;
                    break;
                case 3:
                    tutar += corba * porsiyon;
                    break;
                case 4:
                    tutar += salata* porsiyon;
                    break;
                case 5:
                    tutar += kuruPilav * porsiyon;
                    break;
                case 6:
                    tutar += pide * porsiyon;
                    break;
                case 7:
                    tutar += ayran* porsiyon;
                    break;
                case 8:
                    tutar += kola* porsiyon;
                    break;
                case 9:
                    tutar += su* porsiyon;
                    break;
                case 10:
                    tutar += cay * porsiyon;
                    break;
                case 11:
                    tutar += fanta * porsiyon;
                    break;
                case 12:
                    tutar += soda * porsiyon;
                    break;
            }
            System.out.println("Başka bir isteğiniz Var mı? varsa 0 hariç herhangi bir tuşa basınız");
            System.out.println(" Yoksa 0 tuşuna basınız !");
            extra=input.nextInt();
            //tutar+=tutar;

        }
        System.out.println("İstediğiniz ürünlerin toplam tutarı : "+tutar+" TL dir.");



    }
}
