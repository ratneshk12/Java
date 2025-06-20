public class Operator {
    public static void main(String[] args) {
        /**
         * mathematical operations
         */
        int num1 = 12;
        int num2 = 4;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        /**
         * comparison operator
         */
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);

        /**
         * assignment operator
         */

        int num3 = 7;
        num3 = num3+5;
        num3 += 5;
        num3 -= 7; //num2 = num3-7
        num3 %= 5;

        System.out.println(num3);

        /**
         * post and pre - increment operator
         */
//        int i = 0;
//        i++;
//
//        int j = 0;
//        ++j;
//
//        System.out.println(i);
//        System.out.println(j);

//        int i = 0;
//        i++;
//
//        int j = 0;
//        ++j;
//
//        System.out.println(i);
//        System.out.println(j);

        int i = 0;
        System.out.println(i++); // 0, use i and then increment
        int j = 0;
        System.out.println(++j);

        System.out.println(i);
        System.out.println(j);

        /**
         * Logical Operators
         *And, Or, Xor, Not
         */
        //And
//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(false && true);
//        System.out.println(false && false);
//
//        //or
//
//        System.out.println(true || true);
//        System.out.println(true || false);
//        System.out.println(false || true);
//        System.out.println(false ||false);
//
//        // Xor
//        System.out.println(true ^ true);
//        System.out.println(true ^ false);
//        System.out.println(false ^true);
//        System.out.println(false ^ false);

        /**
         * Binary Operator
         *
         * Humans -> 0, 1, 2 .... 9
         * computers -> 0, 1
         *
         * 4 -> Binary ? 0100
         *
         * 113 -> 1110001
         *
         *
         */

        /**
         * shift operator
         *
         * << -> left shift
         * >> -> Right shift
         */

        System.out.println(5<<1);
        /**
         * 5 -> 101 << 1 = 1010 -> 0*2p0 + 0*12p1 + 0*2p3 + 1*2p3
         * 0+2+0+0 = 10
         */
        System.out.println(12>>1);
        /**
         * 12 -> 1100 >> 1 0110 > 6
         *
         * 8 4 2 1
         * 1 1 0 0
         */

        System.out.println(12&4);

        /**
         * 12 1100
         *    0100
         */

        System.out.println(12/4);
        /**
         *
         * 12    1100
         *        &
         *       0100
         *    ------------
         *       1100 -> 12
         */
    }
}
