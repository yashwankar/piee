import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day28Sol {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] arr = new String[N];
        int len = 0;
        
        // Pattern n1 = Pattern.compile("[a-z]{1,20}");
        Pattern e1 = Pattern.compile("[a-z]+@gmail\\.com$");
        
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            
            // Matcher n2 = n1.matcher(firstName);
            Matcher e2 = e1.matcher(emailID);
            
            if(e2.find())
                arr[len++] = firstName;
        }
        scanner.close();
        
        String[] ans = new String[len];
        System.arraycopy(arr, 0, ans, 0, len);
        Arrays.sort(ans);
        
        for(String k : ans)
        System.out.println(k);
    }
}

/*
Learnings:
[] for giving specified letters or ranges
{} for quantifiers

*  0 or more
+  1 or more
?  0 or one

^  beginning/ negation if used inside[]
$  ending
.  anything of one char
\s whitespace
\d digit

*/