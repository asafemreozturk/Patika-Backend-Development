
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	int a,b;
	double c;
	Scanner sc=new Scanner(System.in);
	System.out.print("1. kenarı giriniz: ");
	a=sc.nextInt();
	System.out.print("2. kenarı giriniz: ");
	b=sc.nextInt();
	

	c=Math.sqrt(b*b+a*a);
	System.out.print("Hipotenüs uzunluğu: "+c);
	}
}
