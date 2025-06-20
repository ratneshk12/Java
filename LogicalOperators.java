public class LogicalOperators {
    public static void main(String[] args) {
        int p =2, q = 3, r =2;
        //&& operator
        System.out.println((p>q) && (p<r));
        System.out.println((p<q) && (p>r));

        // || operator
        System.out.println((p>q) ||(p<r));
        System.out.println((p<q) ||(p>r));

        // ! operator
        System.out.println(!(p==q));
        System.out.println(!(p==r));
        System.out.println(!(p<q));

    }
}
