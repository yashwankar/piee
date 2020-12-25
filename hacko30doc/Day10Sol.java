// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.concurrent.*;
// import java.util.regex.*;
import java.util.Scanner;

public class Day10Sol {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        int count=0, maxOne=0, remainder;
        while(n>0){
            remainder=n%2;
            n/=2;
            if(remainder==1){
                count+=1;
                if(count>maxOne)
                maxOne=count;
            }
            else count=0;
        }
        System.out.println(maxOne);
    }
}
/*
Learnings:
Conversion of base 10 numbes to base 2 binary numbers.

Different approaches to solve the given problem:
like 
1) Used just above
2) compares maxCount with tmpCount if the end of a section of consecutive ones has been reached
3) compares maxCount with tmpCount at every index in the binary string.
4)  splits the string on the 0's and returns an array of the consecutive-1 substrings.
 Then it iterates through the array and prints the one having maximum length.
5) splits the string on the 0's and returns an array of the consecutive-1 substrings.
 Then it sorts the array and prints the length of the last element.
*/