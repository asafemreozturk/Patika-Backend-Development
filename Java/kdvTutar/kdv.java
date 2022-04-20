
import java.util.Scanner;

public class Main
{
    public static void kdv(String[] args) {
      double ucret,tutar, kdvOran=0.18;
      
      Scanner sc=new Scanner(System.in);
      System.out.print("Ücret tutarını girin: ");
      ucret=sc.nextInt();
      
      double kdvTutar=ucret*kdvOran;
      double kdvliTutar=ucret+kdvTutar;
      System.out.print("Kdv dahil ücret: " + kdvliTutar + " TL");

     }
}
