package priv.huidong;

/**
 * @program: collection
 * @auther: HuiDong
 * @date: 2020/7/7 23:27
 * @description: 可重入粒度测试：递归调用本方法
 */
public class SynchronizedResurion10 {
    int a = 0;

    private synchronized void method1(){
        System.out.println("这是method1,a="+a);
        if (a==0){
            a++;
            method1();
        }
    }
    public static void main(String[] args) {
        SynchronizedResurion10 synchronizedResurion10 = new SynchronizedResurion10();
        synchronizedResurion10.method1();
    }
}
