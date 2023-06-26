package Advanced.A_Thread;

//通过实现 Runnable 接口的方案来创建线程，要优于继承 Thread 类的方案，主要有以下原因：
//
// Java 不支持多继承，所有的类都只允许继承一个父类，但可以实现多个接口。如果继承了 Thread 类就无法继承其它类，这不利于扩展；
// 继承 Thread 类通常只重写 run() 方法，其他方法一般不会重写。继承整个 Thread 类成本过高，开销过大。
public class RunnableDemo1 implements Runnable{

    private int i=5;

    public void run(){
        while(i>0){
            System.out.println(Thread.currentThread().getName()+i);
            i--;
        }
    }

    public static void main(String[] args) {

        RunnableDemo1 runnableDemo1=new RunnableDemo1();
        RunnableDemo1 runnableDemo2=new RunnableDemo1();

        Thread thread1=new Thread(runnableDemo1,"线程1");
        Thread thread2=new Thread(runnableDemo2,"线程2");

        thread1.start();
        thread2.start();
    }
}
