public class Ucak {
    //km ve yas bilgisi gir tek yön çift yön
    //km ve yas  0 dan büyük olmalı  if
    // if(age<12) normal %50 indirim if type==çift
    //
    //
}
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Bir yıl giriniz");
        int yil= scanner.nextInt();
        if(yil%4==0)
        {
            if((yil%100==0)&&(yil%400!=0))
            {
                System.out.println("artık yıl değildir");
            }else
            {
                System.out.println("artık yıl ");
            }

        }
