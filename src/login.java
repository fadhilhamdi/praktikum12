import java.util.Scanner;

public class login {
    public String Code[] = {"JKIhy12","667HYbg0","ADd12pL","DMART","89HjmGbv"};
    public String captcha;
    public int hit =-1;
    public login(){
        String usr;
        String pw;
        System.out.println("SELAMAT DATANG DI DREAM MART");
        for(int eql =1; eql<= 40; eql++){
            System.out.print("=");
        }
        System.out.println("\nLog in  ");
            do{
                Scanner n = new Scanner(System.in);
                System.out.print("Username         : ");
                usr = n.next();
                System.out.print("Password         : ");
                pw = n.next();
                if(usr.equalsIgnoreCase("dmart") && pw.equals("ayoBelanja")){
                    int custom = 0;                    
                    do{
                        if(custom>0){
                            System.out.println("Captcha Salah !!!");
                        }
                        custom++;
                        hit ++;
                        hit %=3;
                        System.out.println("Kode Captcha     : " + Code[hit]);
                        System.out.print("Entry Captcha    : ");
                        Scanner cd = new Scanner(System.in);
                        captcha = cd.next();

                    }while(!captcha.equals(Code[hit]));

                    System.out.println("Akun Ditemukan");
                    break;
                    
                }else{
                    System.out.println("Coba Lagi");
                }
            }while(!usr.equals("dmart") || !pw.equals("ayobelanja"));

        
    }
}