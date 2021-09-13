import java.util.Scanner;

public class Area_rect {
    int l;
    int b;
    int result;
    public void m(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of l and b:");
        l=scanner.nextInt();
        b=scanner.nextInt();
        result=l*b;
        System.out.println("Area of rectangle is " +result);
    }
    public  void m2(){
        result=2*(l+b);
        System.out.println("Perimeter of rectangle= " +result);
    }
    public static void main(String[] args) {
        Area_rect obj=new Area_rect();
        obj.m();
        obj.m2();
    }
}
