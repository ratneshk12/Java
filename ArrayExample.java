public class ArrayExample {
    void demoArrays(){
        int [] ages = new int [5];
        float [] weights = new float [3];
        String [] names = new String [2];


        ages[0]=1;
        ages[1]=9;
        ages[2]=10;
        ages[3]=11;
        ages[4]=12;

        weights[1]=1;
        weights[2]=2;
        weights[3]=3;

        System.out.println(ages[1]);public class OddNumbers {
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

    }
}
