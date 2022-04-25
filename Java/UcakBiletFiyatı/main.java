import java.util.Scanner;

public class main {
    public static void main(String[] args){
        System.out.println("ss");
        int mesafe,yas,yolculukTipi;
        Scanner sc=new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz: ");
        mesafe=sc.nextInt();

        System.out.println("Yaşınızı giriniz: ");
        yas=sc.nextInt();

        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi=sc.nextInt();

        if( (yolculukTipi==1 || yolculukTipi==2 ) && mesafe > 0 && yas>0 ){
           double ucret=mesafe*0.10;
           System.out.println("Toplam Tutar ="+ucret+" TL");
           if(yas<12){
               ucret=ucret-ucret*0.5;
               if(yolculukTipi==2) {
                   ucret = (ucret - ucret * 0.20)*2;
                   System.out.println("Toplam Tutar ="+ucret+" TL");
               }
           }
           else if(yas>=12 ||yas <=24){
                ucret=ucret-ucret*0.1;
               if(yolculukTipi==2) {
                   ucret = (ucret - ucret * 0.20)*2;
                   System.out.println("Toplam Tutar ="+ucret+" TL");
               }
           }
           else if(yas>65){
               ucret=ucret-ucret*0.30;
               if(yolculukTipi==2) {
                   ucret = (ucret - ucret * 0.20)*2;
                   System.out.println("Toplam Tutar ="+ucret+" TL");
               }
           }
           else if(yolculukTipi==2) {
               ucret = (ucret - ucret * 0.20)*2;
               System.out.println("Toplam Tutar ="+ucret+" TL");
           }
        }
        else {
            System.out.println("Hatalı veri girdiniz !");
        }




    }

}
