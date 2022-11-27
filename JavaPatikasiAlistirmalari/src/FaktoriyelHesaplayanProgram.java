import java.util.Scanner;

public class FaktoriyelHesaplayanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Faktöriyel sayısını giriniz : ");
        int number = inp.nextInt();
        int total = 1;

        for (int i = 1; i <= number; i++) {
            total = total * i;

        }
        System.out.println(number + ".Faktöriyel : "+total);
    }
}
