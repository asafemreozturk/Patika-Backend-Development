import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	double armut=2.14,elma=3.67,domates=1.11,
	muz=0.95,patlıcan=5;
	double toplam;
	int arkg, elkg,domkg,muzkg,patkg;
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Armut Kaç Kilo ? :");
	arkg=sc.nextInt();
	System.out.print("Elma Kaç Kilo ? :");
	elkg=sc.nextInt();
	System.out.print("Domates Kaç Kilo ? :");
	domkg=sc.nextInt();
    System.out.print("Muz Kaç Kilo ? :");
	muzkg=sc.nextInt();
	System.out.print("Patlıcan Kaç Kilo ? :");
	patkg=sc.nextInt();
    
    toplam=(armut*arkg)+(elma*elkg)+(domates*domkg)+(muz*muzkg)
    +(patlıcan*patkg);
    
    System.out.print("Toplam tutar : "+toplam+" TL");
	}
}
