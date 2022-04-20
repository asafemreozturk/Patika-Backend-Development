/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
      double ucret,tutar, kdvOran=0.18;
      
      Scanner sc=new Scanner(System.in);
      System.out.print("Ücret tutarını girin: ");
      ucret=sc.nextInt();
      
      double kdvTutar=ucret*kdvOran;
      double kdvliTutar=ucret+kdvTutar;
      System.out.print("Kdv dahil ücret: " + kdvliTutar + " TL");

     }
}
