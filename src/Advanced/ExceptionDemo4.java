package Advanced;

public class ExceptionDemo4 {

    static class MyCustomException extends RuntimeException{
        public MyCustomException(){
            super("我自定义的异常");
        }
    }

    public static void main(String[] args) {
        throw new MyCustomException();
    }
}
