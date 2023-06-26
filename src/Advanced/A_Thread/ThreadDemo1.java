package Advanced.A_Thread;

//通过继承 Thread 类创建线程可分为以下 3 步：
//
//        定义 Thread 类的子类，并重写该类的 run() 方法。run() 方法的方法体就代表了线程要完成的任务；
//        创建 Thread 子类的实例，即创建线程对象；
//        调用线程对象的 start 方法来启动该线程。

public class ThreadDemo1 extends Thread{

    public int index;
    public ThreadDemo1(int index) {
        this.index=index;
    }

    public void run(){
        System.out.println("这里是线程体"+index);
//        打印当前线程的名称
//        System.out.println(getName());
    }

    public static void main(String[] args) {
//        实例化ThreadDemo1对象
        for(int i=0;i<5;i++){
            ThreadDemo1 threadDemo=new ThreadDemo1(i);
            threadDemo.start();
        }

    }

}
