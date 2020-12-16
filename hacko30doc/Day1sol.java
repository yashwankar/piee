import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1Sol {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int j = scan.nextInt();
        double e = scan.nextDouble();
        scan.nextLine();
        String t = scan.nextLine();
        System.out.println(i + j);
        System.out.format("%.1f\n", d + e);
        System.out.println(s + t);
        scan.close();
    }
}