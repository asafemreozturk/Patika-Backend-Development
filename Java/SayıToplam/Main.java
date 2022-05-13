import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Sayı giriniz: ");
		Scanner sc=new Scanner(System.in);
		int num, toplam=0;
		
		while(true){
		    
		    num=sc.nextInt();
		    if(num%4==0 && num%2==0)
		        toplam+=num;
		    else{
		        System.out.println("Tek Sayı veya 2 ve 4'e ortak bölünmeyen bir sayı girdiniz, başka bir sayı girin !");
		        break;
		    }
		    
		    
		}
		
		System.out.println("Girdiğiniz sayıların toplamı: "+toplam);
	}
}
