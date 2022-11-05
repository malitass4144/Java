import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat;
        int turkce;
        int kimya;
        int fiz;
        int tarih;
        int muzik;
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your math result");
        mat=input.nextInt();
        System.out.println(mat);

        System.out.println("please enter your Turkce result");
        turkce=input.nextInt();
        System.out.println(turkce);

        System.out.println("please enter your Kimya result");
        kimya=input.nextInt();
        System.out.println(kimya);

        System.out.println("please enter your Fizik result");
        fiz=input.nextInt();
        System.out.println(fiz);

        System.out.println("please enter your Tarih result");
        tarih=input.nextInt();
        System.out.println(tarih);

        System.out.println("please enter your Müzik result");
        muzik=input.nextInt();
        System.out.println(muzik);

        int total=mat+muzik+fiz+kimya+tarih+turkce;
        double average=total/6;

        String str=(average)>=60 ? "Sınıfı geçtiniz,tebrikler!":"Sınıfı geçemediniz!";
        System.out.println("ortalamanız: "+average +"   "+ str);
    }
}
