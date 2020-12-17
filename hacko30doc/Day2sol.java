import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day2sol {
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip, tax, total_cost;
        tip = tip_percent * meal_cost / 100;
        tax = tax_percent * meal_cost / 100;
        total_cost = meal_cost + tip + tax;
        System.out.println(Math.round(total_cost));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final String seq = "(\r\n|[\n\r\u2028\u2029\u0085])?";
        double meal_cost = scanner.nextDouble();
        scanner.skip(seq);
        int tip_percent = scanner.nextInt();
        scanner.skip(seq);
        int tax_percent = scanner.nextInt();
        scanner.skip(seq);
        solve(meal_cost, tip_percent, tax_percent);
        scanner.close();
    }
}