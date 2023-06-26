package ObjectClass;

public class MethodDemo2 {

    public int getSumOfSquares(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i*i;
        }
        return sum;
    }

    public static void main(String[] args) {
        MethodDemo2 methodDemo2=new MethodDemo2();
        int sumOfSquares=methodDemo2.getSumOfSquares(5);
        System.out.println("1到5的累加平方和:"+sumOfSquares);
    }
}
