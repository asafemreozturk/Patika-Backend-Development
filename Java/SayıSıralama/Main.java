import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("1. Sayı :");
		num1=sc.nextInt();
		
		System.out.print("2. Sayı :");
		num2=sc.nextInt();
		
		System.out.print("3. Sayı :");
		num3=sc.nextInt();
		
		if((num1<num2)&&(num1<num3)){
		    if(num2<num3){
		        System.out.print(num1+"<"+num2+"<"+num3);
		    }
		    else{
		         System.out.print(num1+"<"+num3+"<"+num2);
		    }
		}
		else if((num2<num1)&&(num2<num3)){
		    if(num1<num3){
		        System.out.print(num2+"<"+num1+"<"+num3);
		    }
		    else{
		        System.out.print(num2+"<"+num3+"<"+num1);
		    }
		    
		}
		else{
		    if(num1<num2){
		        System.out.print(num3+"<"+num1+"<"+num2);
		    }
		    else{
                System.out.print(num3+"<"+num2+"<"+num1);		        
		        
		    }
		    
		    
		}
		
		
	}
}
