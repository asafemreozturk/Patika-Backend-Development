import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	String userName, password;
	
	
	
	Scanner inp=new Scanner(System.in);
	System.out.print("Kullanıcı Adınız :");
	userName=inp.nextLine();
	System.out.print("Şifreniz :");
	password=inp.nextLine();
	
    	if(userName.equals("root") && password.equals("root123")){
    	    System.out.println("Giriş Yaptınız !");
    	} else {
    	    System.out.println("Bilgileriniz Yanlış !");
    	    
    	}
    	
    	if(password!="root123"){
            System.out.println("Şifreyi sıfırlamak istiyorsanız 1 yazın.");
    	    Scanner sc=new Scanner(System.in);
    	    int sıfırla=sc.nextInt();
    	    if(sıfırla==1){
    	        System.out.println("Yeni şifre yazınız: ");
    	        Scanner np=new Scanner(System.in);
    	        String npassword=np.nextLine();
    	        if(npassword.equals("root123")){
    	            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
    	        }
    	        else{
    	            System.out.println("Şifre oluşturuldu.");
    	        }
    	    }
    	    else {
    	        System.out.println("Şifre sıfırlamak istemediniz.");
    	    }
    	}

	}
	
}
