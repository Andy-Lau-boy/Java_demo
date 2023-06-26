package LeetCode;

public class S5 {

    public String longestPalindrome(String s) {

        int Maxlength=0;
        int size=s.length();
        int begin=0;
        boolean [][]status=new boolean[size][size];

        if(s.length()<2){
            return s;
        }

        status[0][1]=true;

        for(int r=1;r<size;r++){
            for(int l=0;l<r;l++){
                if((s.charAt(l)==s.charAt(r))&&(r-l<2||status[l+1][r-1])){
                    status[l][r]=true;
                    if(r-l>Maxlength){
                        Maxlength=r-l;
                        begin=l;
                    }
                }
            }
        }

        return s.substring(begin,begin+Maxlength);

    }

    public static void main(String[] args) {

        String s="babad";

        S5 s5=new S5();

        System.out.println(s5.longestPalindrome(s));

        System.out.println(s.substring(0,1));

    }
}
