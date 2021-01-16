import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        char[] first = a.toCharArray();
        char[] second = b.toCharArray();
        
        java.util.Arrays.sort(first);
        java.util.Arrays.sort(second);
        return java.util.Arrays.equals(first, second);
    }
  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

/*

to use system library functions without import
provide the complete absolute path of the method
e.g., java.util.Arrays.equals(a, b)

*/
