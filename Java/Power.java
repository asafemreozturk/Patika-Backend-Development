import java.util.Scanner;

public class Power
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int base,power,result=1;
		System.out.print("Base : ");
		base=sc.nextInt();
		System.out.print("Power : ");
	    power=sc.nextInt();
        
        if(power==0){
            result=1;
        } else {
            for(int a=1;a<=power;a++){
                result=result*base;
            }
            
        }
   
		System.out.println("Result : "+result); 
	}
}
