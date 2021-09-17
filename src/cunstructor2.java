public class cunstructor2 {
    double r;
    cunstructor2(double a){
        r=a;
    }
    double Area(){
        return 2*3.14*r;
    }
}
class main{
    public static void main(String[] args) {
        cunstructor2 c=new cunstructor2(7.9);
        System.out.println("Area :"+c.Area());
    }
}
