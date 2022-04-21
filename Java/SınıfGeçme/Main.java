import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		int mat,fizik,kimya,bio,tarih,cografya;
		int toplam=0;
		int dersSayısı=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Matematik Notunu girin: ");
		mat=sc.nextInt();
		if(!(mat<=0 || mat>=100)){
		    toplam+=mat;
		    dersSayısı++;
		}
		
		System.out.print("Fizik Notunu girin: ");
		fizik=sc.nextInt();
		if(!(fizik<=0 || fizik>=100)){
		    toplam+=fizik;
		    dersSayısı++;
		}
		
		System.out.print("Kimya Notunu girin: ");
		kimya=sc.nextInt();
		if(!(kimya<=0 || kimya>=100)){
		    toplam+=kimya;
		    dersSayısı++;
		}
		
		System.out.print("Biyoloji Notunu girin: ");
		bio=sc.nextInt();
		if(!(bio<=0 || bio>=100)){
		    toplam+=bio;
		    dersSayısı++;
		}
		
		System.out.print("Tarih Notunu girin: ");
		tarih=sc.nextInt();
		if(!(tarih<=0 || tarih>=100)){
		    toplam+=tarih;
		    dersSayısı++;
		}
			
		System.out.print("Coğrafya Notunu girin: ");
		cografya=sc.nextInt();
		if(!(cografya<=0 ||cografya>=100)){
		    toplam+=cografya;
		    dersSayısı++;
		}
		
		if(toplam/dersSayısı<55)
		{
		    System.out.print("\n Sınıfta kaldın.");
		}
		else{
		    System.out.print("\n Sınıfı geçtin.");
		}
	}
}
