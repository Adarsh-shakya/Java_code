public class Circle2 {
    double r;
    double circumference(){
        return 2*3.14*r;
    }
    double Area(){
        return 2.14*r*r;
    }
}
class circleMain{
    public static void main(String[] args) {
        Circle2 c=new Circle2();
        Circle2 c2=new Circle2();
        c.r=5.0;
        c2.r=6.4;
        System.out.println("circumferncce :"+c.circumference());
        System.out.println("Area :"+c.Area());
        System.out.println("circumfernce2 :"+c2.circumference());
        System.out.println("Area2 :"+c2.Area());

    }
}