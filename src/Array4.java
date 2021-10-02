import java.util.Scanner;

public class Array4
{
    int arr[]=new int[5];
    void setArray()
    {
        Scanner sca =new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("enter the "+(i+1)+" element of the array: ");
            arr[i]=sca.nextInt();
        }
    }
   void changeIndex(int i,int num)
    {
        arr[i]=num;
    }
}
class ArraMain
{
    public static void main(String []args)
    {
        Array4 obj=new Array4();
        Scanner sca =new Scanner(System.in);
        obj.setArray();
        System.out.println("Array before changing: ");
        System.out.print("{");
        for(int i:obj.arr){
            System.out.print(i+" ");
        }
        System.out.println("\b}");
        System.out.println("Enter the index and value of the array fo changing: ");
        int n=sca.nextInt();
        int in=sca.nextInt();
        obj.changeIndex(n,in);
        System.out.println("Array after changing: ");
        System.out.print("{");
        for (int i:obj.arr
             ) {
            System.out.print(i+" ");
        }
        System.out.println("\b}");
    }
}
