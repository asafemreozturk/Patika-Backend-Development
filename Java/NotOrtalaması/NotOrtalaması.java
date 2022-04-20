
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
      int mat,fizik,turkce,tarih, biyoloji;
      
      Scanner sc=new Scanner(System.in);
      System.out.print("Mat notu girin: ");
      mat=sc.nextInt();
      
      System.out.print("Fizik notu girin: ");
      fizik=sc.nextInt();
      
      System.out.print("Turkce notu girin: ");
      turkce=sc.nextInt();
      
      System.out.print("Tarih notu girin: ");
      tarih=sc.nextInt();
      
      System.out.print("Biyoloji notu girin: ");
      biyoloji=sc.nextInt();
      
      int sum=mat+fizik+turkce+tarih+biyoloji;
      int ort=sum/5;
      System.out.print("Ortalama Notunuz: "+ort);
      
      String result= (ort >60) ? " Sınıfı Gecti"  : " Sınıfta Kaldı";
      System.out.println(result);
    }
}
