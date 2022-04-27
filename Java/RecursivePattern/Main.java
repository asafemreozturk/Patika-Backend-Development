import java.util.Scanner;

public class Main
{
   public static int firstVal;
   
   public static int goDown(int num){
       if(num<1){
           goUp(num);
           return 1;
       }
       System.out.print(num+" ");
       return goDown(num-=5);
   }
   
   public static int goUp(int num){
       if(num>firstVal){
           
           return 1;
       }
       System.out.print(num+" ");
       return goUp(num+=5);
   }
    
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Sayı değeri giriniz :");
        int num=sc.nextInt();
        firstVal=num;
        goDown(num);
        
	}
	
}
