import java.util.Scanner;

public class Day16Sol {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        in.close();
        try{
            int ans = Integer.parseInt(S);
            System.out.println(ans);
        }
        catch(Exception e){
            System.out.println("Bad String");
        }
    }
}
/*
Learnings:
1) Basic exception handling 
2) parsing integer from string.
3) try block with resources
*/
