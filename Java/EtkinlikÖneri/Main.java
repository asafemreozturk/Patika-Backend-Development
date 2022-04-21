import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		int scklk;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Sıcaklık değeri giriniz: ");
		scklk=sc.nextInt();
		
		if(scklk < 5){
		    System.out.println("Kayak yapabilirsiniz.");
		}
		
		else if(scklk >= 5 && scklk <10){
		    System.out.println("Sinemaya gidebilirsiniz.");
		}
		
		else if(scklk >=10 && scklk <= 15){
		    System.out.println("Pikniğe ya da sinemaya gidebilirsiniz.");
		}
		
		else if(scklk >15 && scklk < 25){
		    System.out.println("Piknik yapabilirsiniz.");
		}
	    else if(scklk==25){
	        System.out.println("Pikniğe ya da yüzmeye gidebilirsiniz.");
	    }
	    else{
	        System.out.println("Yüzmeye gidebilirsiniz.");
	    }
	    
	    
	}
}
