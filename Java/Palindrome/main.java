import java.util.Scanner;

public class main {
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz :");
        int num = sc.nextInt();

        if (palindrom(num)) {
            System.out.println(num+" Palindrom bir sayı.");
        } else {
            System.out.println(num+" Palindrom bir sayı değil.");
        }
    }

    private static boolean palindrom(int value) {
        int temp = value, reverse = 0, lastNum;
        do {
            lastNum = temp % 10;
            reverse = (reverse * 10) + lastNum;
            temp /= 10;
        } while (temp != 0);
        if (value == reverse) {
            return true;
        } else {
            return false;
        }
    }
}



