import java.util.Scanner;

public class Main
{
    static int prime(int num,int b){
       if (num==b) {
            System.out.println(num + " sayısı Asaldır !");
            return 1;
        }else if(num % b == 0) {
            System.out.println(num + " sayısı Asal sayı değildir !");
            return 1;
        }
        return prime(num, ++b);
    }
    
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Sayı değeri giriniz :");
        num=sc.nextInt();
       
        
        prime(num,2);
	}
	
}
