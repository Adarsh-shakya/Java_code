import java.util.Scanner;

public class ifStatement {
    private  int marks;

    public void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks: ");
        marks=sc.nextInt();
        if(marks>70){
            System.out.println("You did Pass:");
        }
        else
        {
            System.out.println("You did not Pass");
        }
    }
}
class ifStatemerntMain{
    public static void main(String[] args) {
        ifStatement obj=new ifStatement();
        obj.main();
    }
}
