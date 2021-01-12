import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
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
        
        Pattern n1 = Pattern.compile("[a-z]{1,20}");
        Pattern e1 = Pattern.compile("[a-z@\\.]{1,50}@gmail\\.com$");
        
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];
            
            Matcher n2 = n1.matcher(firstName);
            Matcher e2 = e1.matcher(emailID);
            
            if(n2.find() && e2.find()){
                arr[len] = firstName;
                len++;
            }
        }
        scanner.close();
        
        for(int i=0; i<len-1; i++){
            for(int j=0; j<i; j++){
                if(arr[j].compareTo(arr[j+1]) > 0){
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int k=0; k<len; k++)
        System.out.println(arr[k]);
        
    }
}
