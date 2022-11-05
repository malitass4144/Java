import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Kullanıcı adınızı girin:");
        String userName=input.nextLine();
        System.out.print("Parolanızı girin:");
        String password=input.nextLine();

        if(userName.equals("malitass4144")&&password.equals("M.ali.tas.4144")){
            System.out.println(" Başarılı bir şekilde giriş yaptınız!Hayrını görün");
        }else{
            System.out.println("Hatalı bir giriş yaptınız hacı abi!");
        }

    }
}
