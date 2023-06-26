package LeetCode;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedTransferQueue;

public class S17 {

    public List<String> letterCombinations(String digits) {
//        if not digits: return []
//        phone = ['abc','def','ghi','jkl','mno','pqrs','tuv','wxyz']
//        queue = ['']
//        for digit in digits:
//        for _ in range(len(queue)):
//        tmp = queue.pop(0)
//        for letter in phone[ord(digit)-50]:
//        queue.append(tmp + letter)
//        return queue

        List<String> result=new ArrayList<>();

        Queue<String> queue=new LinkedTransferQueue<String>();

        String[] phone={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        int step=0;

        queue.add("");

//        queue.add(phone[digits.charAt(step)-'2']);

        while(step<digits.length()){
//            step++;

            String curr=phone[digits.charAt(step)-'2'];

            int size=queue.size();
            for(int i=0;i<size;i++){
                String tmp=queue.peek();
                for(int j=0;j<curr.length();j++){
                    queue.add(tmp+curr.charAt(j));
                }
                queue.remove();
            }
            step++;
        }


        while (!queue.isEmpty()){
            result.add(queue.peek());
            queue.remove();
        }

        return result;
    }

    public static void main(String[] args) {

        String digits = "23";

        S17 s17=new S17();
        System.out.println(s17.letterCombinations(digits));

    }

}
