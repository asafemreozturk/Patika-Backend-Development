import java.util.Scanner;

public class Main
{
    static void addition(int a,int b){
        int result=a+b;
        System.out.println("Toplama işlemi sonucu : " + result);
    }
    
    static void substraction(int a,int b){
        int result=a-b;
        System.out.println("Çıkarma işlemi sonucu : " + result);
    }
    
    static void multiplication(int a,int b){
        int result=a*b;
        System.out.println("Çarpma işlemi sonucu : " + result);
    }
    
    static void division(int a,int b){
        if(b==0){
            System.out.println("Sayı 0'a bölünemez !");
           
        } else {
        int result=a/b;
        System.out.println("Bölme işlemi sonucu : " + result);
        }    
    }
    
    static void pow(int a,int b){
        int result=1;
        int i=1;
        while(i<=b){
           result*=a;
           i++; 
        }
        System.out.println(a+"^"+b+" = "+ result);
    }
    
    static void factorial(int a){
        int result=1;
        int i=1;
        while(i<=a){
           result*=i;
           i++; 
        }
        System.out.println("Faktoriyel işleminin sonucu : "+ result);
    }
    
    static void mod(int a,int b){
        int result=a%b;
        System.out.println("Mod işlemi sonucu : " + result);
    }
    
    static void rectangle(int a,int b){
        int perimeter,area;
        perimeter=2*(a+b);
        area=a*b;
        System.out.println("Dikdörtgenin alanı : " + area);
        System.out.println("Dikdörtgenin çevresi : " + perimeter);
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int select, a, b;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        
        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = sc.nextInt();
            System.out.print("1. sayı : ");
            a = sc.nextInt();
            System.out.print("2. sayı : ");
            b = sc.nextInt();

            switch (select) {
                case 1:
                    addition(a, b);
                    break;
                case 2:
                    substraction(a, b);
                    break;
                case 3:
                    multiplication(a, b);
                    break;
                case 4:
                    division(a, b);
                    break;
                case 5:
                    pow(a, b);
                    break;
                case 6:
                    factorial(a);
                    break;
                case 7:
                    mod(a, b);
                    break;
                case 8:
                    rectangle(a, b);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, lütfen geçerli bir değer giriniz !");
            }
        } while (select != 0);
	}
}
