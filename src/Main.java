import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       List arrayList=new ArrayList();

       for(int i=0;i<5;i++){
           arrayList.add(i);
           System.out.println(arrayList);
       }

       arrayList.remove(1);
       System.out.println(arrayList);
    }
}