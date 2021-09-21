import java.util.Scanner;

public class switchCase //Defination class
{
    public void m(int num){
      switch(num) {
          case 1:
              System.out.println("Today is Monday");
              break;
          case 2:
              System.out.println("Today is Tuesday");
              break;
          case 3:
              System.out.println("Wednesday");
              break;
          case 4:
              System.out.println("Today is Thursday");
              break;
          case 5:
              System.out.println("Today is Friday");
              break;
          case 6:
              System.out.println("Today is Saturday");
              break;
          case 7:
              System.out.println("Today is Sunday");
              break;
      }
    }
}
class switchMain{
    public static void main(String[] args) {
        switchCase obj=new switchCase();
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the number of day(1,2,3,4,5,6,7): ");
        obj.m(sca.nextInt());
    }
}