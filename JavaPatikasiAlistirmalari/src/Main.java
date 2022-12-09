import java.util.Scanner;
public class Main {

    static void asalSayi(int num, int i) {



        if(i==num){
            System.out.println(num+ " Sayısı asaldır");
            return;
        }
        else if(num%i==0){
            System.out.println(num+ " Sayısı asal sayı değildir.");
            return;
        }
        asalSayi(num,i+1);

    }
    public static void main(String[] args) {
        int num;
        int i=2;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        num = input.nextInt();
        asalSayi(num,i);

    }
}