import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print(" Doğduğunuz yılı giriniz: ");
        int dogumYili=input.nextInt();

        if(dogumYili%12==0) System.out.println(" Çin zodyağı burcunuz: Maymun");
        if(dogumYili%12==1) System.out.println(" Çin zodyağı burcunuz: Horoz");
        if(dogumYili%12==2) System.out.println(" Çin zodyağı burcunuz: Köpek");
        if(dogumYili%12==3) System.out.println(" Çin zodyağı burcunuz: Domuz");
        if(dogumYili%12==4) System.out.println(" Çin zodyağı burcunuz: Fare");
        if(dogumYili%12==5) System.out.println(" Çin zodyağı burcunuz: Öküz");
        if(dogumYili%12==6) System.out.println(" Çin zodyağı burcunuz: Kaplan");
        if(dogumYili%12==7) System.out.println(" Çin zodyağı burcunuz: Tavşan");
        if(dogumYili%12==8) System.out.println(" Çin zodyağı burcunuz: Ejderha");
        if(dogumYili%12==9) System.out.println(" Çin zodyağı burcunuz: Yılan");
        if(dogumYili%12==10) System.out.println(" Çin zodyağı burcunuz: At");
        if(dogumYili%12==11) System.out.println(" Çin zodyağı burcunuz: Koyun");
    }
}
