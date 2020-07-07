package priv.huidong;

/**
 * @program: collection
 * @auther: HuiDong
 * @date: 2020/7/7 23:35
 * @description: 可重入粒度测试：调用父类方法
 */
public class SynchronizedSuperClass12 {

    public synchronized void doSomething(){
        System.out.println("我是父类方法");
    }
}
class TestClass extends SynchronizedSuperClass12{
    public synchronized void doSomething(){
        System.out.println("我是子类方法");
        super.doSomething();
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.doSomething();
    }
}
