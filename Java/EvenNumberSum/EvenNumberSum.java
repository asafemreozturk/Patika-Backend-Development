import java.util.Scanner;

public class EvenNumberSum
{
	public static void main(String[] args) {
	    int a=0, sum=0,num;	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=sc.nextInt();
		for(int c=0;c<=num;c++){
		    if(c%3==0 && c%4==0){
		        a=a+1;
		        sum=sum+1;
		    }
		}
		int mean=sum/a;
		System.out.println(mean);
	}
}
