import java.util.Scanner;
public class İkininKuvvetleriniBulmaProgrami {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        int number=inp.nextInt();

       for (int i = 1; i<= number; i*=2){
           System.out.println(i);
        }
    }
}
