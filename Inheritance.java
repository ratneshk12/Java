public class Inheritance {
    public static void main(String[] args) {
        fish shark = new fish ();
        shark.eat();
    }
}

// Base Class
class Animal{
    String color;

    void eat(){
        System.out.println("eat");
    }
    void breathes(){
        System.out.println("breathes");
    }
}

// Derived class

class fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swim");
    }
}
