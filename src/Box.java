public class Box {
    int width;
    int height;
    int depth;
    Box(int width,int height,int depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public static void main(String[] args) {
        Box obj=new Box(12,45,30);
        System.out.println("Width of box: "+obj.getWidth());
        System.out.println("Depth of box:  "+obj.getDepth());
        System.out.println("HeightOf box: "+obj.getHeight());
    }
}
