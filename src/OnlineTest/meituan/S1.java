package OnlineTest.meituan;

import java.util.*;

public class S1 {

    public  static long s(Long number, Long target){

        long result=0;
        long flag=0;

        Stack<Long>stack=new Stack<>();
        while(number>0){
            stack.push(number%10);
            number=number/10;
        }
        while(!stack.isEmpty()){
            long cur=stack.pop();
            if(target>cur&&flag==0){
                result=result*10+target;
                flag=1;
            }
            result=10*result+cur;
        }
        if(flag==0){
            result=10*result+target;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        Long num = in.nextLong();
        for(int i = 0; i < num; i++) { // 注意 while 处理多个 case
            Long a = in.nextLong();
            Long b = in.nextLong();
            Long result=s(a,b);
            System.out.println(result);
        }

    }
}
