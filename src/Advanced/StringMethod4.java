package Advanced;

//切割为字串数组

public class StringMethod4 {
    public static void main(String[] args) {

        String str1="I love Java";

        String[] strArr=str1.split(" ");

        for(String str:strArr){
            System.out.println(str+'\t');
        }
    }
}
