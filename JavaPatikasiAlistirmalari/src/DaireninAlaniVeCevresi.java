import java.util.Scanner;
public class DaireninAlaniVeCevresi {
    public static void main(String[]args){
        System.out.print("enter radius of circle you for calculating its perimeter and area : ");
        Scanner input=new Scanner(System.in);
        double radius=input.nextDouble();
        double PI=3.14;
        double perimeter=(int)(2*PI*radius*100)/100.0;
        double area=(int)(PI*radius*radius*100)/100.0;
        System.out.println(" perimeter of circle is : "+perimeter);
        System.out.println(" area of circle is : "+area);
    }
}
