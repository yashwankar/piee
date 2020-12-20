import java.io.*;
import java.util.*;

public class EnfOfLine {

    public static void main(String[] args) {
        int count = 1;
        Scanner sc = new Scanner(System.in);
        do{
            String s = sc.nextLine();
            System.out.println(count+" "+s);
            count++;
        }while(sc.hasNext());
    }
}
/*
Learnings:
hasNext() returns the boolean value true if the scanner has another object token in the input
next() takes complete token and delimeter is whitespace
nextLine() used to get complete line by the Scanner class 
*/ 