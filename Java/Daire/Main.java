
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	int r,a;
	double alan;
	double cevre;
	double p=3.14;
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Yarıçapı giriniz: ");
	r=sc.nextInt();
	System.out.print("Merkez açı ölçüsü giriniz: ");
	a=sc.nextInt();
	
	alan= (p*(r*r)*a) / 360;
	cevre= (2*p*r*a) / 360;
	System.out.print("Cemberin alanı: "+alan+"\n");
	System.out.print("Cemberin cevresi: "+cevre);
	}
}
