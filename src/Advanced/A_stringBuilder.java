package Advanced;


//StringBulider是可以动态扩展的在原来的地址空间继续存放
//String不可以动态扩展，例如string str="a  当str="a"+"b" 会重新分配内存的
public class A_stringBuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Hello");
        System.out.println(str.reverse());
    }
}
