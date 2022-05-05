import java.util.Scanner;
import java.util.Arrays;

public class ArraySort
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Dizi boyutu girin: ");
		int[] listNum=new int[sc.nextInt()];
		int a=0;
		while(a<listNum.length){
		    System.out.print(a+1 +". Eleman : ");
		    listNum[a]=sc.nextInt();
		    a++;
		}
		Arrays.sort(listNum);
		System.out.print(Arrays.toString(listNum));
	}
}
