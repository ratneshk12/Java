public class AbstractionDemo {
    /**
     *Abstraction
     *
     * 100% -> interface
     *
     * 0-100% -> Abstract Classes
     */
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
    }
}
/**
 *
 * Abstract
 */

abstract class Demo1{
    public abstract void login ();
    public void eat(){
        System.out.println("Eating Food");
    }
}
