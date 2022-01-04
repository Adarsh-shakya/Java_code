
class A extends Thread{
    public void run(){
        for(int i=0;i<6;i++){
            System.out.println("From threadA "+i);
        }
        System.out.println("thread A is exist...");
    }
}
class B extends Thread {
    public void run() {
        for (int j = 0; j < 6; j++) {
            System.out.println("From threadB " + j);
        }
        System.out.println("thread B is exist...");
    }
}
class C extends Thread {
        public void run() {
            for (int k = 0; k < 6; k++) {
                System.out.println("From threadC " + k);
            }
            System.out.println("thread C is exist...");
        }
    }

class getSetPriority {
    public static void main(String[] args) {
       A ThreadA =new A();
       B ThreadB =new B();
       C ThreadC =new C();
       ThreadA.setPriority(Thread.MIN_PRIORITY);
       ThreadB.setPriority(ThreadA.getPriority()+1);
       ThreadC.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Start thread A");
        ThreadA.start();
        System.out.println(" start thread B");
        ThreadB.start();
        System.out.println("Start thread C");
        ThreadC.start();
        System.out.println("End of main Thread");
    }
 }
