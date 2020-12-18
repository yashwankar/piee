import java.util.Scanner;

public class Day3sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }
}

/*
 * Learnings are : long n = 461012; System.out.format("%d%n", n); // -->
 * "461012" System.out.format("%08d%n", n); // --> "00461012"
 * System.out.format("%+8d%n", n); // --> " +461012" System.out.format("%,8d%n",
 * n); // --> " 461,012" System.out.format("%+,8d%n%n", n); // --> "+461,012"
 * 
 * double pi = Math.PI;
 * 
 * System.out.format("%f%n", pi); // --> "3.141593" System.out.format("%.3f%n",
 * pi); // --> "3.142" System.out.format("%10.3f%n", pi); // --> "     3.142"
 * System.out.format("%-10.3f%n", pi); // --> "3.142"
 * System.out.format(Locale.FRANCE, "%-10.4f%n%n", pi); // --> "3,1416"
 */