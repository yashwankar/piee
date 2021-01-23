import java.util.Scanner;
import java.util.regex.*;
class UsernameValidator {
    public static final String regularExpression = "^[a-zA-Z]{1}\\w{7,29}$";
}

public class UserNameValidatorRegex {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}

/* 
Learnings:
In the range of the quantifier of the regex space matters like,
if you give space after comma in quantifier it will generate this error:
    Exception in thread "main" java.util.regex.PatternSyntaxException: Unclosed counted closure near index <line>
e.g. 
\\w{7, 29}  --> error
\\w{7,29} --> no error

So, it's better to use the quantifier without the space.
*/