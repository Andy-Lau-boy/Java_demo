package Advanced.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {

    public <T> void show(List<T> t){
        System.out.println(t);
    }

    public static void main(String[] args) {
//        实例化对象
        GenericMethod genericMethod=new GenericMethod();

        ArrayList<String> list=new ArrayList<>();
        list.add("java");
        list.add("Java2");

        genericMethod.show(list);

    }
}
