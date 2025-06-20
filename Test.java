public class Test {
    public static void main(String[] args){
        double a = 0.1;
        double b = 0.2;
        System.out.println(a + b == 0.3);

        add(5,6);
    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
}
