package Advanced.Generics;

import javax.swing.*;

public class NumberGeneric <T>{

    private T number;

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    public static void main(String[] args) {
//        实例化对象，指定元素类型为整型
        NumberGeneric<Integer> integerNumberGeneric=new NumberGeneric<>();
        integerNumberGeneric.setNumber(123);
        System.out.println("integerNumber="+integerNumberGeneric.getNumber());

        NumberGeneric<Long> longNumberGeneric=new NumberGeneric<>();
        longNumberGeneric.setNumber(20L);
        System.out.println("longNumber="+longNumberGeneric.getNumber());

        NumberGeneric<Double> doubleNumberGeneric=new NumberGeneric<>();
        doubleNumberGeneric.setNumber(4000.0);
        System.out.println("doubleNumber="+doubleNumberGeneric.getNumber());

    }
}
