package OnlineTest.meituan;

import java.util.*;

public class Main {
    Queue<Integer> quene=new LinkedList<Integer>();


    public static List calculate(List<Integer> list){

        List<Integer> result=new ArrayList<>();
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        System.out.println("sss");
        System.out.println(list.size());

        int tmp_sum=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==0){
                result.add((list.size()-i-1-sum-tmp_sum)+(tmp_sum));
            }

            if(list.get(i)==1){
                result.add((sum-tmp_sum-1)+(i-tmp_sum));
            }

            tmp_sum=tmp_sum+list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num_data = in.nextInt();

        for(int i = 0; i < num_data; i++) { // 注意 while 处理多个 case

            int n=in.nextInt();
            List<Integer> list=new ArrayList<>();
            while(n>0){
                list.add(in.nextInt());
                n--;
            }
            System.out.println(calculate(list));
        }
    }

}
