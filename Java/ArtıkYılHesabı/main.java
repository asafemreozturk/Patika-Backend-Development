import java.util.Scanner;

public class main {
    public static void main(String[] args){

     

        int yıl;
        Scanner sc=new Scanner(System.in);
        System.out.println("Yıl giriniz: ");
        yıl=sc.nextInt();

        if(yıl%4==0 && yıl%100!=0){
            System.out.println(yıl+" bir artık yıldır !");
        }
        else if(yıl%100==0 && yıl%400==0){
            System.out.println(yıl+" bir artık yıldır !");
        }
        else{
            System.out.println(yıl+" bir artık yıl değildir !");
        }



    }

}
