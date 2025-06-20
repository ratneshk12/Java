import java.util.Scanner;

public class PowerTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num = (n & (n - 1)) ;
        if (num == 0){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
