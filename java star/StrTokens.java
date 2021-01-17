import java.util.Scanner;
public class StrTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        scan.close();

        String[] tokens = s.split("[^a-zA-Z]+");
        int size = tokens.length;
        //for constraints check
        if(size < 1 || size > 400000){
            System.out.println(0);
            return;
        }
        
        System.out.println(size);
        for(String k : tokens)
            System.out.println(k);
        
    }
}

/*
Learning:
array.length is a final variable applicable for arrays.
    length can be used for int[], double[], String[] to know the length of the arrays.


string.length() is a method used for string objects
    length() can be used for String, StringBuilder, etc 
String class related Objects to know the length of the String

^ in regex, can also be used as negation if used within [ ]
*/