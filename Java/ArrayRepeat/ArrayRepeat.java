
import java.util.Arrays;

public class ArrayRepeat
{
	public static void main(String[] args) {
		int[] listNum={5,7,9,15,22,25,32,42,65,54,68,68,68,32,32};
		System.out.println("Dizi : "+Arrays.toString(listNum) );
		Arrays.sort(listNum);
		System.out.println("Tekrar Sayıları");
		int val=listNum[0], count=1, index=1;
		for(int a=1;a<listNum.length;a++){
		    for(int b=index; b<listNum.length;b++){
		        if(val==listNum[b]){
		         count++;
		         if(index<listNum.length) index=b+1;
		        }
		    }
		    System.out.println(val+" sayısı "+count+" kere tekrar edildi.");
		    if(index==listNum.length) break;
		    val=listNum[index];
		    count=0;
		}
	}
}
