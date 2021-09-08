public class instanceBlock
{

    static{
        System.out.println("static block 1");
    }
    {

        System.out.println("instance block");
    }
    instanceBlock(){
        System.out.println("instance constructor");
    }
    instanceBlock(int s){

        System.out.println("peremetarise instance constructor");
    }

    public static void main(String[] args) {
        instanceBlock obj=new instanceBlock();
        instanceBlock obj2=new instanceBlock(4);
    }
}
