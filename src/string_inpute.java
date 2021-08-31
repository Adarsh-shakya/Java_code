import java.util.Scanner;

public class string_inpute {
    public static  void main(String[] ad){
        String name;
        Scanner scanner;
        scanner=new Scanner(System.in);
        System.out.println("Enter name: ");
        name=scanner.next();
        System.out.println("My name is " +name);
    }
}
