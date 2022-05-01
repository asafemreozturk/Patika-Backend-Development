import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter number : ");
        int userNum=sc.nextInt();

        int[]array={12,26,38,97,-102,-1000,233,64};

        closestNumCheck(array,userNum);

    }

    static void closestNumCheck(int[] array, int userNum){
        int[] sortArray= Arrays.copyOf(array, array.length);
        Arrays.sort(sortArray);

        System.out.println("Sorted array "+ Arrays.toString(array));

        if(userNum <= sortArray[0] || userNum >= sortArray[sortArray.length-1]){
            System.out.println("Number is out of range. Number need to be in range of "
                    +sortArray[0]+" and "+ sortArray[sortArray.length-1]);
        } else {
            int lower=sortArray[0];
            int higher=sortArray[sortArray.length-1];

            for(int a:sortArray){
                if(a<userNum) {
                    lower = a;
                }
            }

            for(int b=sortArray.length-1; b>= 0; b--){
                if(sortArray[b]>userNum) {
                    higher=sortArray[b];
                }
            }

            System.out.println("Lower closest number : "+lower);
            System.out.println("Higher closest number : "+higher);
        }

    }





}



