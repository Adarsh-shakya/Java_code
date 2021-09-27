public class BoolenArray {
    public Boolean search(int arr[],int element){
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]==element)
            break;
        }
        if(i==5) return false;
        else return true;
    }

    int arr[]={10,20,30,40,50};
}
class boolen{
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        BoolenArray obj=new BoolenArray();
       if(obj.search(arr,20)){
           System.out.println("true");
       }
       else
       {
           System.out.println("element is not found ");
       }
}
}
