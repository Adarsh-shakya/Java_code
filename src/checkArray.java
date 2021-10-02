import java.util.Scanner;
public class checkArray {
    int arr1[]=new int[5];
    int arr2[]=new int[5];
    Scanner sca=new Scanner(System.in);
    public void setArr1() {
        System.out.println("Enter the 5 element of array1: ");
        for(int i=0;i<5;i++){
            arr1[i]=sca.nextInt();
        }
    }
    public void setArr2(){
        System.out.println("Enter the 5 element of the array2: ");
        for(int i=0;i<5;i++){
            arr2[i]=sca.nextInt();
        }
    }
    public void checkarr(){
        int i;
        for(i=0;i<5;i++){
            if(arr1[i]!=arr2[i]){
                break;
            }
        }
        if(i==5) System.out.println("Both Array are equal:");
        else System.out.println("Both array are not equal: ");
    }
}
class checkMain{
    public static void main(String[] args) {
        checkArray obj=new checkArray();
        obj.setArr1();
        obj.setArr2();
        obj.checkarr();
    }
}
