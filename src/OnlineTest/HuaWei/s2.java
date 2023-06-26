package OnlineTest.HuaWei;

import java.util.Scanner;

public class s2 {


        public static void main(String[] args) {
//            Scanner in=new Scanner(System.in);
//            while(in.hasNext()) {
//                int length = in.nextInt();
//                String expression = in.nextLine();
               String expression="12345#1+126.53@";
                System.out.println(evaluateExpression(expression));


//            }
        }

        public static double evaluateExpression(String expression) {
            // 检查表达式是否包含特殊字符
            if (expression.contains("!") || expression.contains("@") || expression.contains("#")) {
                // 按特殊规则计算
                if (expression.contains("!") && expression.contains("@")) {
                    expression = expression.replace("!", "6");
                    expression = expression.replace("@", "7");
                }

                if (expression.contains("#") && expression.contains("@")) {

                    int indexof=expression.indexOf("@");
                    char c=expression.charAt(indexof-1);
                    String new_String=Integer.toString(Integer.valueOf(String.valueOf(c))+2);
                    char n_char=new_String.charAt(0);


                    StringBuilder sb = new StringBuilder(expression);
                    sb.setCharAt(indexof-1,n_char);
                    expression=sb.toString();

                    expression = expression.replace("@", "0");
                    expression = expression.replace("#", "0");
                }
                if (expression.contains("!") && expression.contains("#")) {
                    expression = expression.replace("!", "2");
                    expression = expression.replace("#", "2");
                }

                if (expression.contains("@") && expression.contains("@")) {
                    int indexof=expression.indexOf("@");
                    char c=expression.charAt(indexof-1);
                    String new_String=Integer.toString(Integer.valueOf(String.valueOf(c))+7);
                    char n_char=new_String.charAt(0);


                    StringBuilder sb = new StringBuilder(expression);
                    sb.setCharAt(indexof-1,n_char);
                    expression=sb.toString();
                    expression = expression.replace("@", "0");
                }

                if (expression.contains("#") && expression.contains("#")) {
//                    expression = expression.replace("@", "20");
                    int indexof=expression.indexOf("@");
                    char c=expression.charAt(indexof-1);
                    String new_String=Integer.toString(Integer.valueOf(String.valueOf(c))+5);
                    char n_char=new_String.charAt(0);


                    StringBuilder sb = new StringBuilder(expression);
                    sb.setCharAt(indexof-1,n_char);
                    expression=sb.toString();
                    expression = expression.replace("#", "0");
                }
            }

            // 拆分表达式
            String[] operands = expression.split("\\+");

            // 计算表达式结果
            double result = Double.parseDouble(operands[0]);
            for (int i = 1; i < operands.length; i++) {
                result += Double.parseDouble(operands[i]);
            }

            return result;
        }
    }

