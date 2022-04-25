import java.util.Scanner;

public class main {
    public static void main(String[] args){
        System.out.println("ss");
        int gun,ay;
        Scanner sc=new Scanner(System.in);
        System.out.println("Kaçıncı ayda doğdunuz: ");
        ay=sc.nextInt();

        System.out.println("Hangi günde doğdunuz: ");
        gun=sc.nextInt();

        switch (ay){
            case 1:
                if(gun>=1 && gun<=31){
                    if(gun>=21){
                        System.out.println("Kova Burcusunuz");
                    }
                    else {
                        System.out.println("Oğlak Burcusunuz");
                    }
                }
                else{
                    System.out.println("1 ile 31 arasında değer giriniz !");
                }
                break;
            case 2:
                if(gun>=1 && gun<=31){
                    if(gun>=20){
                        System.out.println("Balık Burcusunuz");
                    }
                    else {
                        System.out.println("Kova Burcusunuz");
                    }
                }
                else{
                    System.out.println("1 ile 31 arasında değer giriniz !");
                }
                break;
            case 3:
                if(gun>=1 && gun<=31){
                    if(gun>=21){
                        System.out.println("Koç Burcusunuz");
                    }
                    else {
                        System.out.println("Balık Burcusunuz");
                    }
                }
                else{
                    System.out.println("1 ile 31 arasında değer giriniz !");
                }
                break;
            case 4:
                if(gun>=1 && gun<=31){
                    if(gun>=21){
                        System.out.println("Boğa Burcusunuz");
                    }
                    else {
                        System.out.println("Koç Burcusunuz");
                    }
                }
                else{
                    System.out.println("1 ile 31 arasında değer giriniz !");
                }
                break;
            case 5:
                if(gun>=1 && gun<=31){
                    if(gun>=21){
                        System.out.println("İkizler Burcusunuz");
                    }
                    else {
                        System.out.println("Boğa Burcusunuz");
                    }
                }
                else{
                    System.out.println("1 ile 31 arasında değer giriniz !");
                }
                break;
            case 6:
                if(gun>=1 && gun<=31){
                    if(gun>=22){
                        System.out.println("Yengeç Burcusunuz");
                    }
                    else {
                        System.out.println("İkizler Burcusunuz");
                    }
                }
                else{
                    System.out.println("1 ile 31 arasında değer giriniz !");
                }
                break;
            case 7:
                if(gun>=1 && gun<=31){
                    if(gun>=23){
                        System.out.println("Aslan Burcusunuz");
                    }
                    else {
                        System.out.println("Yengeç Burcusunuz");
                    }
                }
                else{
                    System.out.println("1 ile 31 arasında değer giriniz !");
                }
                break;
            case 8:
                if(gun>=1 && gun<=31){
                    if(gun>=24){
                        System.out.println("Başak Burcusunuz");
                    }
                    else {
                        System.out.println("Aslan Burcusunuz");
                    }
                }
                else{
                    System.out.println("1 ile 31 arasında değer giriniz !");
                }
                break;
            case 9:
                if(gun>=1 && gun<=31){
                    if(gun>=24){
                        System.out.println("Terazi Burcusunuz");
                    }
                    else {
                        System.out.println("Başak Burcusunuz");
                    }
                }
                else{
                    System.out.println("1 ile 31 arasında değer giriniz !");
                }
                break;
            case 10:
                if(gun>=1 && gun<=31){
                    if(gun>=24){
                        System.out.println("Akrep Burcusunuz");
                    }
                    else {
                        System.out.println("Terazi Burcusunuz");
                    }
                }
                else{
                    System.out.println("1 ile 31 arasında değer giriniz !");
                }
                break;
            case 11:
                if(gun>=1 && gun<=31){
                    if(gun>=23){
                        System.out.println("Yay Burcusunuz");
                    }
                    else {
                        System.out.println("Akrep Burcusunuz");
                    }
                }
                else{
                    System.out.println("1 ile 31 arasında değer giriniz !");
                }
                break;
            case 12:
                if(gun>=1 && gun<=31){
                    if(gun>=22){
                        System.out.println("Oğlak Burcusunuz");
                    }
                    else {
                        System.out.println("Yay Burcusunuz");
                    }
                }
                else{
                    System.out.println("1 ile 31 arasında değer giriniz !");
                }
                break;

        }



    }

}
