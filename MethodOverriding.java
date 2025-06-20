//Method Overriding (Parent & Child
// classess both contain the same function with a diff definition

public class MethodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("Eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats grass");
    }
}

//class Calculator {
//    int sum(int a, int b) {
//        return a + b;
//    }
//}