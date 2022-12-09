import java.util.Scanner;

public class recursiveMethodlaUsHesabi  {
    static int us(int n1,int n2){
        int result=1;
        for (int i=1;i<=n2;i++){
            result*=n1;
        }
        System.out.println("Sonuç : "+result);
        return result;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen taban sayısını giriniz : ");
        int n1=input.nextInt();
        System.out.print("Lütfen üssü giriniz : ");
        int n2=input.nextInt();
        us(n1,n2);

    }

}
