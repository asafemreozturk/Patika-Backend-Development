import java.util.Scanner;

public class Main
{
    static int pow(int a,int b){
        
        if(b<1){
            return 1;
        }
        
        return a*pow(a,b-1);
    }
    
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Taban değeri giriniz :");
        a=sc.nextInt();
        System.out.println("Üs değeri giriniz :");
        b=sc.nextInt();
        
        System.out.println("Sonuç "+pow(a,b));
	}
	
}
