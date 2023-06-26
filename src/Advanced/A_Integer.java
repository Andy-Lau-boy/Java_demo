package Advanced;

public class A_Integer {

    public static void main(String[] args) {

        Integer num=new Integer(8);

        Integer num2=new Integer(8);

        System.out.println(num.equals(num2));

        StringBuilder s=new StringBuilder("abc");

        StringBuilder s2=new StringBuilder("abc");

        System.out.println(s.equals(s2));

        int number=Integer.parseInt("123");
        System.out.println(number);

        int number2=new Integer("123");
        System.out.println(number2);
    }
}
