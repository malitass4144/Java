import java.util.Scanner;

public class gelismisHesapMakinesi {

    static int sum(int n1, int n2) {
        int result = n1 + n2;
        System.out.println(" Sonuç : " + result);
        return result;
    }

    static int cikarma(int n1, int n2) {
        int result = n1 - n2;
        System.out.println(" Sonuç : " + result);
        return result;
    }

    static int carpma(int n1, int n2) {
        int result = n1 * n2;
        System.out.println(" Sonuç : " + result);
        return result;
    }

    static int bolme(int n1, int n2) {
        if (n2 == 0) {
            System.out.println(" bölme işleminde ikinci sayı sıfır olamaz");
            return 1;
        }

        int result = n1 / n2;
        System.out.println(" Sonuç : " + result);
        return result;
    }

    static int usluSayi(int n1, int n2) {
        int result = 1;
        for (int i = 1; i <= n2; i++) {
            result *= n1;
        }
        System.out.println(" Sonuç : " + result);
        return result;
    }

    static int dikdörtgen(int n1, int n2) {
        int cevre = 2 * (n1 + n2);
        int alan = n1 * n2;
        System.out.println("Çevresi : " + cevre + "    Alanı : " + alan);
        return cevre;
    }

    static int mod(int n1, int n2) {
        int result = n1 % n2;
        System.out.println("Modu : " + result);
        return result;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu = " 1-TOPLAMA  2-ÇIKARMA 3-ÇARPMA 4-BÖLME ?\n"
                + "5-ÜSLÜ SAYI HESAPLAMA 6-MOD ALMA \n"
                + "7-DİKDÖRTGEN ALAN VE ÇEVRE HESABI 8-ÇIKIŞ YAP ";

        while (true) {

            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
            System.out.println(menu);
            int choice = input.nextInt();
            if (choice == 8) {
                System.exit(0);
            }
            System.out.print("ilk sayıyı giriniz:");
            int n1 = input.nextInt();
            System.out.print("ikinci sayıyı giriniz:");
            int n2 = input.nextInt();
            switch (choice) {
                case 1:
                    sum(n1, n2);
                    break;
                case 2:
                    cikarma(n1, n2);
                    break;
                case 3:
                    carpma(n1, n2);
                    break;
                case 4:
                    bolme(n1, n2);
                    break;
                case 5:
                    usluSayi(n1, n2);
                    break;
                case 6:
                    mod(n1, n2);
                    break;
                case 7:
                    dikdörtgen(n1, n2);
                    break;

            }
        }
    }
}
