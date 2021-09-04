import java.util.Random;
import java.util.Scanner;

public class Rand {
    Random rand=new Random();
    int num=rand.nextInt(10);
    public static void main(String[] arg){
        Rand obg=new Rand();
        System.out.println(obg.num);
    }
}
//Second program on random
class rand2{
    int startingNum;
    int count;
    int winningNUm;
    int max,min;
    public void m(){
        Random rand=new Random();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Starting Number: ");
        startingNum=scan.nextInt();
        System.out.println("Enter the number of goers: ");
        count=scan.nextInt();
        min=startingNum+1;
        max=startingNum+count;
        winningNUm=rand.nextInt(max-min+1)+min;
        System.out.println("The Winner number is " +winningNUm);
    }
    public static void main(String[] args) {
        rand2 obj=new rand2();
        obj.m();
    }
}
