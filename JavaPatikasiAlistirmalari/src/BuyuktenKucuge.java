import java.util.Scanner;
public class BuyuktenKucuge {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" Please enter an integer");
        int n1=input.nextInt();
        System.out.println("Please enter a second integer");
        int n2=input.nextInt();
        System.out.println(" Enter a third integer");
        int n3=input.nextInt();

        if((n1>n2)&&(n1>n3)){
            if(n2>n3){
                System.out.println(" n1 >n2>n3 ");
            }else{
                System.out.println("n1>n3>n2");
            }
        } else if ((n2>n3)&&(n2>n1)) {
            if (n1>n3){
                System.out.println("n2>n1>n3");
            }else{
                System.out.println("n2>n3>n1");
            }
        } else if ((n3>n1)&&(n3>n2)) {
            if (n1>n2){
                System.out.println("n3>n1>n2");
            }else {
                System.out.println("n3>n2>n1");
            }
        }else {
            System.out.println("Numaralardan bazıları birbirine eşit veya hatalı bir giriş yaptınız");
        }
    }
}
