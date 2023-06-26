package ObjectClass;

public class MethodDemo1 {

    public void printArea(float a,float b){
        float result=a*b;
        System.out.println("长方形面积："+result);
    }

    public static void main(String[] args) {
        MethodDemo1 methodDemo1=new MethodDemo1();

        float width=12.3f;
        float height=20f;

        methodDemo1.printArea(width,height);
    }
}
