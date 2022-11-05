import java.util.Scanner;
public class HavaSicakliginaGöreEtkinlik {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("Lütfen hava sıcaklığını giriniz");
        int degree=input.nextInt();

        if (degree<5){
            System.out.println(" Kayak yap hacı abi! ");
        } else if (degree<15){
            System.out.println(" Sinemaya git hacı abi! ");
        } else if (degree<25){
            System.out.println(" Piknik yap hacı abi! ");
        } else {
            System.out.println(" yüz hacı abi! ");
        }

        }
    }

