import java.util.*;
import java.io.*;

public class Datatypes {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127)
                    System.out.println("* byte");
                if (x >= -32768 && x <= 32767)
                    System.out.println("* short");
                if (x >= -2147483848L && x <= 2147483647L)
                    System.out.println("* int");
                if (x >= -9223372036854775808L && x <= 9223372036854775807L)
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
                System.out.println(e);
            }

        }
    }
}

/* 
Learnings :
To directly use constants of range equal or greater than integer type i.e., -2147483848 to 2147483847
then L should be added as suffix to the constant literal

exception e value is:
java.util.InputMismatchException: For input string: "89235709284620897562956802938602"
which basically returns the same string input which raised the exception
this will then be catched by sc.next()
*/