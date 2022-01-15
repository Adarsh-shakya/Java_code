import java.util.Scanner;

public class UserExeption {
    static int b;
    static int h;
    static{
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the number: ");
        b=sca.nextInt();
        h=sca.nextInt();
    }

    public static void main(String[] args) {
        try{
         if(b<0 || h<0)throw new Exception("java.lang.Exception: Breadth and height must be positive");
         else{
             System.out.println(b*h);
         }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
