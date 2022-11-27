import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç basamaklı bir ters üçgen yapmak istersiniz : ");
        int basamak = input.nextInt();
        int i =1;
        int tempBasamak=basamak;

        while (i <= basamak) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j=1;j<=(2*tempBasamak-1);j++) {
                System.out.print("*");
            };
            i++;
            tempBasamak--;
            System.out.println();
        }

    }
}
