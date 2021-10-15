public class box2 {
    //constructor overloading
    double height;
    double width;
    double depth;

    box2(int a,int b,int c){
        depth=b;
        height=a;
        width=c;
    }
    box2(){
        depth=2;
        height=3;
        width=4;

    }
    double main(){
        return depth*height*width;
    }
}
class consOverload
{
    public static void main(String[] args) {
        box2 obj1=new box2(3,4,5);
        box2 obj2=new box2();
        System.out.println( "Volume: "+obj1.main());
        System.out.println( "Volume: "+obj2.main());

    }
}
