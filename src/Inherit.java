public class Inherit {
    //inheritance in java

    int i;
    int j;

    void showij()
    {
        System.out.println("i and j :"+ i+" "+j);
    }
}
class herit extends Inherit
{
    int k;
    void sum(){
        System.out.println("sum :"+(i+j+k));
    }
}
class main3
{
    public static void main(String[] args) {
        Inherit supObj=new Inherit();
        herit   subObj=new herit();
        supObj.i=34;
        supObj.j=12;
        supObj.showij();
        subObj.i=9;
        subObj.j=7;
        subObj.k=8;
        subObj.sum();
        subObj.showij();
    }
}