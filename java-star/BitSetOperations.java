import java.io.*;
import java.util.*;

public class BitSetOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        BitSet b1 = new BitSet(N);
        BitSet b2 = new BitSet(N);
        
        while(M-- >0){
            String op = sc.next();
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            int p = sc.nextInt();
            int q = sc.nextInt();
            switch(op){
                case "AND":
                    if(p == 1) b1.and(b2);
                    else b2.and(b1);
                    break;
                case "OR":
                    if(p == 1) b1.or(b2);
                    else b2.or(b1);
                    break;
                case "XOR":
                    if(p == 1) b1.xor(b2);
                    else b2.xor(b1);
                    break;
                case "FLIP":
                    if(p == 1) b1.flip(q);
                    else b2.flip(q);
                    break;
                case "SET":
                    if(p == 1) b1.set(q);
                    else b2.set(q);
                    break;        
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}
/* 
Learnings :
BitSet class implements a vector of bits.
Imagine it like, a given number of many zeroes and ones stored in dynamic array
to perform basic/logic operation really quick.

One of the good ways to perform bit manipulation in constant times.
    1) It can only store boolean values.
    2) When initialized it has default value as false.
    3) It can perform the and, or, xor operation of two bitsets.
    4) It can flip, set, and tell the number of bits in a bitset(cardinality).

*/