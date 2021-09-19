import java.util.Scanner;

public class Array {
    int array[]={2,3,5,6,7,8,12,67,90};
    int num,i;

    public void setNum(int num) {
        this.num = num;
    }
    public void check(){
        for( i=0;i< array.length;i++){
            if (num == array[i]){
                break;
            }
        }
        if(i==array.length){
            System.out.println("number is not present:");
        }
        else{
            System.out.println("Number is present");
        }
    }
}
class ArrMain{
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
    Array obj=new Array();
        System.out.println("Enter the number:");
    obj.setNum(sca.nextInt());
    obj.check();
}}
