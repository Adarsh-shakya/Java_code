import java.util.Scanner;

public class Palindrome {
    //int []Array=new int[100];
    int Number;
    int reverse;

    public void setArray(){
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        number=sc.nextInt();
        Number=number;
         reverse=0;
        while(number!=0) {
            int r = number % 10;
             reverse = reverse * 10 + r;
            number = number / 10;
        }
       // System.out.println(Number);
        //System.out.println(reverse);
       if(Number==reverse){
            System.out.println(Number+" is a palindrome");
        }
        else{
            System.out.println(Number+" is not palindrome");
        }
    }


}
class PalinMain{
    public static void main(String[] args) {
        Palindrome obj=new Palindrome();
        obj.setArray();
    }
}
