import java.util.Scanner;

public class CiftSayilariBulanProgram {
    public static void main(String[] args) {

        Scanner İnput = new Scanner(System.in);

        System.out.print(" Lütfen bir sayı giriniz ve bizde o sayıya kadar olan çift sayıları söyleyelim ");

        int number = İnput.nextInt();

        //we created a number as n1 for our loop

        /*for (int i= 1; i<=number; i++){
            if (i % 2==0){
                System.out.println(i);


            }
        }
        */
        int i = 1;
        while (i <= number) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }


    }
}

