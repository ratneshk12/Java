import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary_num = sc.nextInt();

        int ans = 0; // converted decimal numbers
        int ratnesh = 1; //2^0 = power of 2

        while (binary_num > 0){
            int unit_digit = binary_num % 10;
            ans += (unit_digit * ratnesh);
            binary_num /= 10;
            ratnesh *= 2;
        }
        System.out.println(ans);
    }
}
