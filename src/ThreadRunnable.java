class threadX implements Runnable{
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println("From threadX: "+-1*i);
        }
        System.out.println("Thread X is over...");
    }
}
class threadY implements Runnable{
    public void run(){
        for (int j=1;j<=5; j++) {
            System.out.println("From threadY:" + j);
        }
        System.out.println("thread Y is over....");
    }
}
class threadZ implements Runnable{
    public void run(){
        for (int k=1;k<=5; k++) {
            System.out.println("From threadZ:" + k*2);
        }
        System.out.println("thread Z is over....");
    }
}
class MultiThrRunnable{
    public static void main(String[] args) {
        threadX t1 =new threadX();
        Thread a=new Thread(t1);
        Thread b=new Thread(new threadY());
        Thread c=new Thread(new threadZ());
        a.start();
        b.start();
        c.start();
        System.out.println("...MultiThreading is over...");
    }
}