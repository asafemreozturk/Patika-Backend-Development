import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PalindromeString {
    static boolean isPalindrome(String str) {
        int a = 0, b = str.length() - 1;
        while (a < b) {
            if (str.charAt(a) != str.charAt(b))
                return false;
            a++;
            b--;
        }
        return true;
    }

    static boolean isPalindrome2(String str){
        String reverse="";
        for(int a=str.length()-1;a>=0;a--){
            reverse+=str.charAt(a);
        }

        if(str.equals(reverse))
            return true;
        else
            return false;
    }



    public static void main(String[] args) {
        System.out.println(isPalindrome("babbab"));
    }
}



