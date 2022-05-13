import java.util.Scanner;

public class Combination
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n,r;
		System.out.print("n : ");
		n=sc.nextInt();
		System.out.print("r : ");
	    r=sc.nextInt();
        
        if(r>n){
           System.out.println("r can't be greater than n !"); 
        }
        int nFact = 1;
        for(int i=1; i<=n; i++) {
            nFact = i * nFact;
        } 
        int rFact = 1;
        for(int i=1; i<=r; i++) {
            rFact = i * rFact;
        }
        int coFact = 1;
        int co=(n-r);
        for(int i=1; i<=co; i++) {
            coFact = i * coFact;
        }
        
        double result=nFact/(rFact*coFact);
		System.out.println("Result of Combination: "+result); 
	}
}
