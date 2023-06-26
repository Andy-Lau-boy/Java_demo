package Advanced;

import java.util.Scanner;

public class A_scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一段内容");

        String str=scanner.next();
        System.out.println("输入内容为："+str);

        scanner.close();
    }
}
