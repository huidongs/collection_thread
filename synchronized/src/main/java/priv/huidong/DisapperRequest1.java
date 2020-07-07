package priv.huidong;

/**
 * @program: collection
 * @auther: HuiDong
 * @date: 2020/7/7 18:42
 * @description:
 */
public class DisapperRequest1 implements Runnable{

    static DisapperRequest1 instance = new DisapperRequest1();
    static int i = 0;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(i);
    }

    public synchronized void run() {
        for (int j= 0;j<10000;j++){
            i++;
        }
    }
}
