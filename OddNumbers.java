public class OddNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 1;

        while (count < 50) {
            if (number % 2 != 0) {  // Check if the number is odd
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}