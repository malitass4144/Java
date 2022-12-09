import java.util.Scanner;

public class DeseneGoreMetotOlusturma {

    static int DeseneGoreMetotMınus(int number) {
        int result = number;
        int temp=number;
        while (temp >= -5) {
            System.out.print(result + " , ");

            result  -=5;
            temp -=5;


            if (result<0){
                while(result<number){
                    System.out.print(result+ " , ");
                    result+=5;

                }
            }


        }
        return result;
        }
 

        public static void main (String[]args){
            System.out.println("Lütfen bir sayı girin aq : ");
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            DeseneGoreMetotMınus(number);

        }
    }
