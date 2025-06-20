public class OOpConcepts {
    public static void main(String[] args) {
        /**
         * Create th person object
         */
        Person perObject1 = new Person();
        perObject1.eat();
        perObject1.dance();

        perObject1.name="Ratnesh";
        perObject1.age=18;
    }
    /**
     *
     * person;
     * attributes:
     * Name
     * Age
     * Gender
     * College
     * Behaviour:
     * eat()
     * dance()
     *
     * Person1(Name = "Rishi" ,Age = 32, Gender = Male, College = cgc)
     */
}

class Person {
    /**
     * Attributes
     */
    String name;
    int age;
    char gender;
    /**
     * Behaviour
     */
    public void eat() {
        System.out.println("eating food");
    }
    public void dance() {
        System.out.println("i know how to dance");
    }
}
