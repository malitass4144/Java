import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        int f2 = 1;
        int f1 = 1;
       // int sum = 0;
        int temp;
        do {
            System.out.println("ENTER A NUMBER :");
            System.out.println("WE WİLL FİND FİBONACCİ SERİES TO NUMBER YOU ENTERED");
            System.out.println("PRESS '0' TO EXİT: ");
            number = input.nextInt();
            System.out.println("----------------------------------------------");
            System.out.print(f1 + " - " + f2 + " - ");
            for (int i = 1; (f1+f2) < number; i++) {
                System.out.print((f1+f2) + " - ");
               // sum = f1 + f2;

                temp = f2;
                f2 +=f1;
                f1 = temp;


            }
            System.out.println();

        } while (number != 0);
    }
}
