import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day11Sol {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        scanner.close();
        int hourglass=Integer.MIN_VALUE;
        for (int i=1; i<5; i++){
            for (int j=1; j<5; j++){
                int sum = arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1] 
                                    +arr[i][j]
                        + arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
                if(sum>=hourglass)
                    hourglass=sum;
            }
        }
        System.out.println(hourglass);
    }
}
/*
Learnings:
To iterate through the two dimensional array.
In this case, only including the I-type values to be added to the temporary sum.
instead of falling in square matrix trap. 
*/