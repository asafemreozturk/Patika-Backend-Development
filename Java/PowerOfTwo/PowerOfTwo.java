import java.util.Scanner;

public class PowerOfTwo
{
	public static void main(String[] args) {
		System.out.println("Üs sayısı giriniz: ");
		Scanner sc=new Scanner(System.in);
		double num, sonuc=0;
		
		num=sc.nextInt();
		if(num==0){
		    sonuc=1;
		    System.out.println("Üslü sayının sonucu: "+sonuc);
		}
		else if(num>0){
		    sonuc=Math.pow(2,num);
		    System.out.println("Üslü sayının sonucu: "+sonuc);
		}
        else if(num<0){
            num=0-num;
            sonuc=1/(Math.pow(2,num));
            System.out.println("Üslü sayının sonucu: "+sonuc);
        }

		
	}
}
