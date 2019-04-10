import java.util.*;
import java.io.*;
import java.lang.*;

class main {
    public static void main(String[] args) {
        // a^b
        // your code here
        System.out.println("Please input number of testcase:");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        while (n-- > 0) {
            System.out.println("Input a and b");
            int a = in.nextInt();
            int b = in.nextInt();

            long r = 0;
            if (b == 0 && a != 0) {
                r = 1;
            } else {
                r = 1;
                for (int i = 0; i < b; i++) {
                    r = r * a;
                }
            }
            System.out.println(r);
        }
    }

}
