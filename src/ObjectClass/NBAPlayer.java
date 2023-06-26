package ObjectClass;

//类的作用是封装代码，将类的一些特征和行为隐藏在类内部，不允许类外部直接访问

//在 Java 语言中，如何实现封装呢？需要 3 个步骤。
//        修改属性的可见性为private；
//        创建公开的 getter 和 setter 方法，分别用于属性的读写；
//        在 getter 和 setter 方法中，对属性的合法性进行判断。

public class NBAPlayer {

    private String name;

    private int age;

    public NBAPlayer() {
    }

    public NBAPlayer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        判断参数age的合法性
        if(age<0){
            this.age=0;
        }
        this.age = age;
    }

    public static void main(String[] args) {
        NBAPlayer james=new NBAPlayer();

//        对属性赋值
        james.setName("詹姆斯");
        james.setAge(35);


        System.out.println("姓名："+james.getName());
        System.out.println("年龄:"+james.getAge());

        System.out.println("姓名："+james.name);
    }
}
