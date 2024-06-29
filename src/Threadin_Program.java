//class MyThread3 extends Thread{
//    public void run(){
//        System.out.println("Thread Is running......");
//    }
//}
//class MyThread4 extends Thread{
//    public void run(){
//        System.out.println("Thread 4 is running......");
//    }
//}
//class MyThread5 extends Thread{
//    public void run(){
//        System.out.println("Thread 5 is running");
//    }
//}
//class Mumulti1 implements Runnable{
//    public void run(){
//        System.out.println("Thread is running.........");
//    }
//}
//class Multi1 implements Runnable{
//    public void run(){
//        System.out.println("Thread2 is running.......");
//    }
//}
class t extends Thread{
    public void run(){
        for(int i = 0; i < 5; i++){
            try{
                System.out.println("Hi.....");
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
                System.out.println(i);
            }
        }
    }
}
public class Threadin_Program {
    public static void main(String[] args) {
//        MyThread3 t3 = new MyThread3();
//        t3.start();
//        MyThread4 t4 = new MyThread4();
//        t4.start();
//        MyThread5 t5 = new MyThread5();
//        t5.run();
//        Mumulti1 m1 = new Mumulti1();
//        Thread w = new Thread(m1);
//      w.start();
//      Multi1 t1 = new Multi1();
//      Thread r = new Thread(t1);
//      t1.run();
        t y = new t();
        y.start();

    }
}
