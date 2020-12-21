import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6Sol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        while(T>0){
            String eve="", odd="";
            String s = sc.nextLine();
            for(int i=0; i<s.length(); i++){
                if(i%2==0)
                    eve+=s.charAt(i);
                else
                    odd+=s.charAt(i);
            }
            System.out.printf("%s %s%n",eve,odd);
            T--;
        }
        sc.close();
    }
}

/*
Learnings:
while condition only supports boolean value not integer unlike C++.


sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); uses a regex as:

\r\n is a Windows line ending.
\n is a UNIX line ending.
\r is a Macintosh (pre-OSX) line ending.
\u2028 is LINE SEPARATOR.
\u2029 is PARAGRAPH SEPARATOR.
\u0085 is NEXT LINE (NEL).

This thing separetes the extra whitespace token leftover
 after the input by Scanner class.

 Use sc.close to avoid data leak, 
 its a good pratice for security reasons.
*/