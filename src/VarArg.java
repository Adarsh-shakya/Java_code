public class VarArg{
        int a[];

        VarArg(int...b){
            this.a=b;
        }
        void sum(){
            int sum=0;
            for(int i=0;i<a.length;i++){
                sum+=a[i];
            }
            System.out.print("Sum= "+sum);
        }
    }
    class VairMain{
        public static void main(String []arga){
            VarArg obj=new VarArg(3,4,5,6,7);
            obj.sum();
        }
    }

