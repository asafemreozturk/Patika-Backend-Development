import java.util.Scanner;

public class CinZodyak {
    public static void main(String[] args) {
        int dogumYılı;
        Scanner sc=new Scanner(System.in);
        System.out.println("Doğum Yılınızı giriniz: ");
        dogumYılı=sc.nextInt();

        int cinZodyak=dogumYılı%12;
        switch(cinZodyak){
            case 0:
                System.out.println("Çin Zodyağı Burcunuz : Maymun");
            break;
            case 1:
                System.out.println("Çin Zodyağı Burcunuz : Horoz");
            break;
            case 2:
                System.out.println("Çin Zodyağı Burcunuz : Köpek");
                break;
            case 3:
                System.out.println("Çin Zodyağı Burcunuz : Domuz");
                break;
            case 4:
                System.out.println("Çin Zodyağı Burcunuz : Fare");
                break;
            case 5:
                System.out.println("Çin Zodyağı Burcunuz : Öküz");
                break;
            case 6:
                System.out.println("Çin Zodyağı Burcunuz : Kaplan");
                break;
            case 7:
                System.out.println("Çin Zodyağı Burcunuz : Tavşan");
                break;
            case 8:
                System.out.println("Çin Zodyağı Burcunuz : Ejdarha");
                break;
            case 9:
                System.out.println("Çin Zodyağı Burcunuz : Yılan");
                break;
            case 10:
                System.out.println("Çin Zodyağı Burcunuz : At");
                break;
            case 11:
                System.out.println("Çin Zodyağı Burcunuz : Koyun");
                break;
        }

    }
}
