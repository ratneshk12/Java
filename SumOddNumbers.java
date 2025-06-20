public class SumOddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int number = 1;


        while (count < 50) {
            if (number % 2 != 0) {
                sum += number;
                count++;
            }
            number++;
        }
        System.out.println("The sum of the first 50 odd numbers is: " + sum);
    }
}
