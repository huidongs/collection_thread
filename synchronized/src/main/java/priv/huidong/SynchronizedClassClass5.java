package priv.huidong;

/**
 * @program: collection
 * @auther: HuiDong
 * @date: 2020/7/7 21:03
 * @description:
 */
public class SynchronizedClassClass5 implements Runnable {
    static SynchronizedClassClass5 instance1 = new SynchronizedClassClass5();
    static SynchronizedClassClass5 instance2 = new SynchronizedClassClass5();
    public void run() {
        synchronized (SynchronizedClassClass5.class){
            System.out.println("我是类锁的第二种形式，我叫" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "运行结束.");
        }
    }

    public static synchronized void method(){
        System.out.println("我的对象锁的方法修饰符形式，我叫" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "运行结束.");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);
        t1.start();
        t2.start();
        while (t1.isAlive() || t2.isAlive()) {

        }
        System.out.println("finished");

    }
}
