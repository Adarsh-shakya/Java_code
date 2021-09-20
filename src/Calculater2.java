import java.util.Scanner;

public class Calculater2 {
    double i;
    double x;
    double main(){return Math.sqrt(i);}
}
class CalculaterMain{
    public static void main(String[] args) {
        Calculater2 obj=new Calculater2();
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the number: ");
        obj.i=sca.nextInt();
        System.out.println("Square of "+obj.i+"="+obj.main());
    }
}
