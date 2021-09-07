import java.util.Scanner;

public class Employee2 {
    public int eid;//instance variable
    public String ename;//instance variable

    public void setvalue(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Id and name: ");
        eid=sc.nextInt();
        ename= sc.nextLine();
    }
    public void shaw(){
        System.out.println(eid+"\t"+ename);
    }
}// class end
//Execution class
class Employee2main{
    public static void main(String[] args) {
        Employee2 obj;
        obj=new Employee2();
        obj.setvalue();
        obj.shaw();
    }
}
