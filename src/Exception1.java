import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        int num;
        Scanner sca =new Scanner(System.in);
       try {
           System.out.println("Enter an integer: ");
           num=Integer.parseInt(sca.next());
           System.out.println("Square of the value: "+num*num);
       }
       catch (NumberFormatException e){
           System.out.println("Entered input is not valid for integer");
       }
    }
}
