package ObjectClass;

//继承
//向上转型：把一个子类对象转型为父类对象


public class Pet {
    public void eat(){
        System.out.println("宠物吃东西");
    }

    public static void main(String[] args) {
        Pet pet=new Pet();
        Pet dog=new Dog();
        Pet cat=new Cat();

        pet.eat();
        dog.eat();
//        向下转型，将子类转换成父类
        Dog dog1=(Dog) dog;
        dog1.shy();
        cat.eat();
    }
}


class Dog extends Pet{

    public void eat(){
        System.out.println("狗狗吃狗粮");
    }

    public void shy(){
        System.out.println("害羞");
    }
}

class Cat extends Pet {

    public void eat() {
        System.out.println("猫猫吃猫粮");
    }
}