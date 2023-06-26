package Advanced;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo1 {

    public static void main(String[] args) {
//        实例化一个新的空集
        Set<String> hashSet=new HashSet<String>();

        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("PHP");
        System.out.println(hashSet.toArray());

        System.out.println(hashSet);

        hashSet.remove("Python");
        System.out.println(hashSet);

        Iterator<String> iterator=hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
