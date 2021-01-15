import java.io.*;
import java.util.*;

public class StrRev {
    static String revPalin(String s){
        for(int i=0, j=s.length()-1; i<=j; i++, j--){
            if(s.charAt(i) != s.charAt(j))
                return "No";
        }
        return "Yes";
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        System.out.println(revPalin(A));
    }
}
//Two pointer technique to reduce time complexity to O(n/2)