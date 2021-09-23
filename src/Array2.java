import java.util.Scanner;

public class Array2 {
    public static void main(String args[]) {
        int n;
        double sum=0;
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n=sca.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++) {
            System.out.println("Enter the "+(i+1)+" element: ");
            arr[i]= sca.nextInt();
            sum+=arr[i];
        }
        System.out.println("length of Array : "+arr.length);
        System.out.println("Average: "+(sum/arr.length));

        }
    }

