public class Pallindrome {
    public static void main(String[] args) {

        int n= 5;

        for (int i = 1; i <= n; i++){
            //spaces
            for (int j = 1; j <=n-i; j++){
                System.out.print("  ");
            }
            //first half
            for (int j = i; j>=1; j--){
                System.out.print(j + " ");
            }
            // 2nd half
            for (int j = 2; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
