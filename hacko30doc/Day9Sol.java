import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day9Sol {
    static int factorial(int n) {
        if(n<=1)
        return 1;
        else
        return n*factorial(n-1);
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
        scanner.close();
    }
}

/*
Learning:
basic recursion and its schematic representation.

Also learned about BufferedWriter which is more efficient than Scanner as

It maintains an internal buffer if 8192 characters.
During the write operation, the characters are written to the internal buffer 
instead of the disk. Once the buffer is filled or the writer is closed, 
the whole characters in the buffer are written to the disk.

Hence, the number of communication to the disk is reduced. 
This is why writing characters is faster using BufferedWriter.

It is defined under java.io.BufferedWriter package.
// Creates a FileWriter
FileWriter file = new FileWriter(String name);

// Creates a BufferedWriter
BufferedWriter buffer = new BufferedWriter(file);

Useful Methods:
write() - writes a single character to the internal buffer of the writer
write(char[] array) - writes the characters from the specified array to the writer
write(String data) - writes the specified string to the writer
flush() method. This method forces the writer to write all data present
 in the buffer to the destination file.
newLine() 	inserts a new line to the writer
append() 	inserts the specified character to the current writer

*/
