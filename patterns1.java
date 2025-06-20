import java.util.Scanner;

public class patterns1 {
    public static void main(String[] args) {

        int i = 4;
        int j = 1;
        //outer loop
        for ( i= 1; i <= 4; i++){
            //inner loop
            for (j =1;  j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
