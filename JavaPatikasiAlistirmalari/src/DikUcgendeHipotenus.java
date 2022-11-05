import java.util.Scanner;
public class DikUcgendeHipotenus {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print(" hipotenüsünü hesaplamak istediğiniz üçgenin dik kenarının uzunluğunu girin:");
        int dikKenar=input.nextInt();
        System.out.print(" hipotenüsünü hesaplamak istediğiniz üçgenin yan kenarının uzunluğunu girin:");
        int yanKenar=input.nextInt();
        //double hipotenusKare=(dikKenar*dikKenar)+(yanKenar*yanKenar);
        double hipotenus=Math.pow((Math.pow(dikKenar,2)+Math.pow(yanKenar,2)),0.5);
        System.out.print(" hipotenüs: "+hipotenus);

    }

    }

