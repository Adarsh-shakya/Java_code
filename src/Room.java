import java.util.*;
public class Room {
    Boolean Ac;
    Boolean Home_theater;
    Boolean Fan;
    Boolean Light ;
    int power=0;
    Room(Boolean Ac, Boolean Home_theater, Boolean Fan,Boolean Light ){
        this.Ac=Ac;
        this.Fan=Fan;
        this.Home_theater=Home_theater;
        this.Light=Light;

    }
    public void main(){
        if(Ac)power+=1200;
        if(Home_theater)power+=600;
        if(Fan)power+=400;
        if(Light)power+=100;
    }
    public void output(){
        if(power>2000){
            System.out.println("OverLoad");
        }
    }
}
class rommain{
    public static void main(String[] args) {
    Room obj=new Room(true,true,true,true);
    obj.main();
    obj.output();
}
}
