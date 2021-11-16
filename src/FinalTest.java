public class FinalTest
{
    final double i;
    FinalTest(double i)
    {
        this.i=i;
    }
    public void out()    {
        System.out.println(i);
    }
}
class testFinal
{
    public static void main(String []args)
    {
        FinalTest obj =new FinalTest(98);
        FinalTest obj2=new FinalTest(90);
        System.out.println(obj.i);
        obj.out();
    }
}
