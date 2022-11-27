import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        String password, userName;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 8000;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();
            if (userName.equals("GulsahOzarpali") && password.equals("20062002")) {
                System.out.println("Sisteme giriş yaptınız");
                right = 0;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur,lütfen banka ile iletişime geçiniz");
                } else {
                    System.out.println("Hatalı giriş yaptınız!\nTekrar deneyiniz!\nKalan hakkınız : " + right);
                }
            }
        }
        int choice = 5;

        while (choice > 4) {
            System.out.println("Yapmak istediğiniz işlemi seçin");
            System.out.println("1 - Para çekme");
            System.out.println("2 - Para yatırma");
            System.out.println("3 - Bakiye sorgulama");
            System.out.println("4 - Çıkış yapma ");

            choice = input.nextInt();

            if (choice == 1) {
                System.out.println(" Güncel bakiyeniz : "+balance +" TL ");
                System.out.println("Lütfen çekmek istediğiniz miktarı belirtin");
                int withdraw = input.nextInt();
                int withdrawalBalance = balance - withdraw;
                System.out.println(" Kalan bakiyeniz : " + withdrawalBalance+" TL ");
            } else if (choice == 2) {
                System.out.println(" Güncel bakiyeniz : "+balance);
                System.out.println("Ne kadar para yatırmak istiyorsunuz");
                int deposit = input.nextInt();
                int depositalBalance = balance + deposit;
                System.out.println(" Güncel bakiyeniz: " + depositalBalance+ " TL");
            } else if (choice == 3) {
                System.out.println(" Güncel bakiyeniz : " + balance+ " TL");
            } else if (choice == 4) {
                System.exit(0);
            } else {
                System.out.println(" Hatalı bir tuşlama yaptınız ! ");
            }
        }
    }
}
