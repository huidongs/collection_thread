package priv.huidong;

/**
 * @program: collection
 * @auther: HuiDong
 * @date: 2020/7/7 22:27
 * @description: 同时访问静态加锁方法和非静态加锁方法
 */
public class SynchroinzedStaticAndNormal8 implements Runnable {
    static SynchroinzedStaticAndNormal8 instance = new SynchroinzedStaticAndNormal8();
    public void run() {
        if (Thread.currentThread().getName().equals("Thread-0")){
            method1();
        }else {
            method2();
        }
    }
    public static synchronized void method1(){
        System.out.println("我是加锁方法，我叫" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "运行结束.");
    }
    public synchronized void method2(){
        System.out.println("我是加锁方法，我叫" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "运行结束.");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        while (t1.isAlive() || t2.isAlive()) {

        }
        System.out.println("finished");

    }
}
