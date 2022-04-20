import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	int kg;
	double m;
	
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
	m=sc.nextDouble();
	System.out.print("Lütfen kilonuzu giriniz :");
	kg=sc.nextInt();
	double vkı=kg/(m*m);

    System.out.print("Vücut kitle endeksiniz : "+vkı);
	}
}
