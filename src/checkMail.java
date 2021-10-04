import java.util.Scanner;

public class checkMail {
    String s;
    checkMail(String s){
        this.s=s;
    }
     boolean isIndian() {
         int i = s.lastIndexOf("in");
         if(i>=0)
             return true;
         else
             return false;
     }
}
class MailMain{
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the Mail_ID: ");
        checkMail boj=new checkMail(sca.nextLine());
        if(boj.isIndian()) System.out.println("this is a Indian Mail:");
        else System.out.println("this is not a indian mail: ");
    }
}


