public class TsetArray {
    int []MyArray={1,34,5,6,78,23,56,34,23};
    public void printArray(){
        for(int i=0;i<9;i++){
            System.out.print(MyArray[i]+" ");
        }
    }
//Average
public void average(){
        int sum=0;
        for(int i=0;i<9;i++){
        sum+=MyArray[i];}
    System.out.println("\n"+sum/MyArray.length);
}
}
//execution class
class TestArrayMain{
    public static void main(String[] args) {
        TsetArray boj=new TsetArray();
        boj.printArray();
        boj.average();
    }
}
