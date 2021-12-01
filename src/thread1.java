class thread1 extends Thread{
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println("From thread1: "+-1*i);
        }
        System.out.println("Thread 1 is over...");
    }
}
class thread2 extends Thread{
    public void run(){
        for (int j=1;j<=5; j++) {
            System.out.println("From thread2:" + j);
        }
        System.out.println("thread 2 is over....");
    }
}
class thread3 extends Thread{
    public void run(){
        for (int k=1;k<=5; k++) {
            System.out.println("From thread3:" + k*2);
        }
        System.out.println("thread 3 is over....");
    }
}
class MultiThreads{
    public static void main(String[] args) {
        thread1 a =new thread1();
        thread2 b =new thread2();
        thread3 c =new thread3();
        a.start();
        b.start();
        c.start();
        System.out.println("...MultiThreading is over...");
    }
}