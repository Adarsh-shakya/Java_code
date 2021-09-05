import java.util.Scanner;

public class Calculater{
static int num1,num2;
static double num3;
static public void input(){
    Scanner sca=new Scanner(System.in);
    System.out.println("Enter the First number: ");
    num1=sca.nextInt();
    System.out.println("Enter the second number: ");
    num2=sca.nextInt();
    num3=num1;
}
static public void powerInt(){
    System.out.println("PowerInt : " +Math.pow(num1,num2));
}
static public void powerDouble(){
   System.out.println("PowerDouble : " +Math.pow(num3,num2));
}

    public static void main(String[] args) {
        Calculater.input();
        Calculater.powerInt();
        Calculater.powerDouble();
    }
   }


