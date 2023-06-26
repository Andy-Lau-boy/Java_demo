package Advanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo1 {

    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();

//        添加数据
        map.put("English","英语");
        map.put("Chinese","汉语");
        map.put("Java","咖啡");

        System.out.println(map);

        map.remove("Chinese");

//        修改元素
        map.put("Java","一种编程语言");
        System.out.println(map);

//        遍历map
        Set<Entry<String,String>> entries=map.entrySet();
        for(Entry<String,String> entry:entries){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

}
