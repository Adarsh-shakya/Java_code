import java.util.Scanner;

public class string_inpute {
    public static  void main(String[] ad){
        String name;
        Scanner scanner=new Scanner(System.in);
        //scanner.useDelimiter(System.getProperty("line.separator"));
        System.out.println("Enter name: ");
        name=scanner.next();
        System.out.println("My name is " +name);
    }
}
