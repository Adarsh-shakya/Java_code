public class ArrayChar {
 char ArrChar[]={65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,70,81,82,83,84,85,86,87,88,89,80};
 public void print(){
     //char c;
     for(int i=0;i<ArrChar.length;i++){
         System.out.print(ArrChar[i]+" ");
     }
 }
}
class ArrayCharMain{
    public static void main(String[] args) {
     ArrayChar obj=new ArrayChar();
     obj.print();
    }
}
