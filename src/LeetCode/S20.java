package LeetCode;

import java.util.Stack;

public class S20 {


    public boolean isValid(String s) {

        Stack<Character> stack=new Stack<>();
        int length=s.length();

        for(int i=0;i<length;i++){

//            栈不为空并且括号匹配的话，出栈
            if(!stack.isEmpty()&&stack.peek()=='('&&s.charAt(i)==')'){
                stack.pop();
                continue;
            }

            if(!stack.isEmpty()&&stack.peek()=='{'&&s.charAt(i)=='}'){
                stack.pop();
                continue;
            }

            if(!stack.isEmpty()&&stack.peek()=='['&&s.charAt(i)==']'){
                stack.pop();
                continue;
            }

//            入栈
            stack.add(Character.valueOf(s.charAt(i)));

        }

        if(stack.isEmpty()){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {

        String s = "()[]{}";
        S20 s20=new S20();
        System.out.println(s20.isValid(s));
    }

}
