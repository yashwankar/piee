import java.io.*;
import java.util.*;

public class MaxHourGlassSum {
    static int hourglassSum(int[][] arr) {
        int maxGlass = Integer.MIN_VALUE;
        int len = arr.length;
        for(int i=1; i< len-1; i++){
            for(int j=1; j<len-1; j++){
                int sub = arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1]
                                        + arr[i][j]
                        + arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1];
                if(sub > maxGlass)
                    maxGlass = sub;
            }
        }
        return maxGlass;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
/* 
Learnings:
Look out for the constraints. ;)
*/