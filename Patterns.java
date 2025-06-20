public class Patterns {
    public static void main(String[] args) {
        int i = 4;
        int j = 5;

        // outer loop
        for ( i = 1; i <= 4; i++){
            // inner loop
            for (j= 1; j <= 5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}