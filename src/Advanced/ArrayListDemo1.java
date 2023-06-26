package Advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo1 {

    public static void main(String[] args) {
        //实例化
        List arrayList=new ArrayList();
        for(int i=0;i<5;i++){

            arrayList.add(i);

            System.out.println(arrayList);
        }

        int [] a= {2,1,3};
        Arrays.sort(a);
        System.out.println(a[1]);


    }
}
