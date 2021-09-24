import java.util.ArrayList;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        ArrayList <Integer> arr=new ArrayList<>();
        Scanner sca =new Scanner(System.in);
        System.out.println("Enter the number: ");
        while (sca.hasNextInt()){
            arr.add(sca.nextInt());
            //Enter ^z at end:
        }
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
