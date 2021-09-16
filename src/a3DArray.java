public class a3DArray {
   int  i,j,k;
   int Array[][][]=new int[3][4][5];
   public void setvalues(){
      for(i=0;i<3;i++){
         for(j=0;j<4;j++){
            for(k=0;k<5;k++){
               Array[i][j][k]=i+j+k;
            }
         }
      }
   }
   public void printValue(){
      for(i=0;i<3;i++){
         for(j=0;j<4;j++){
            for(k=0;k<5;k++){
               System.out.print(Array[i][j][k]+" ");
            }
            System.out.println();
         }
         System.out.println();
      }
   }

}
//Execution class
class ArrayMain{
   public static void main(String[] args) {
      a3DArray obj=new a3DArray();
      obj.setvalues();
      obj.printValue();
   }
}