package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class S3 {
    public static void main(String[] args) {
        String s="abc";

        Set<Character> setChar=new HashSet<>();
        setChar.add(new Character(s.charAt(0)));

        setChar.size();
        System.out.println(setChar);

    }
}
