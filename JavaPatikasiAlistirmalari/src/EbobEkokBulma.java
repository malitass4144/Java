import java.util.Scanner;

public class EbobEkokBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" n1 sayısını giriniz : ");
        int n1 = input.nextInt();
        System.out.print(" n2 sayısını giriniz : ");
        int n2 = input.nextInt();
        //we are calculating ebob
        if (n1 < n2) {
            for (int i = n1; i > 0; i--) {
                if (n1 % i == 0 && n2 % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
        } else {
            for (int i = n2; i > 0; i--) {
                if (n1 % i == 0 && n2 % i == 0) {
                    System.out.println(i);
                    break;
                }
            }

        }

        System.out.println("----------------------------------");
        //we are calculating EKOK

        for (int i=1;i<=n1*n2;i++)
            if (i%n1==0 && i%n2==0){
                System.out.println(i);
                break;
            }
    }
}
