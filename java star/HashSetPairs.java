import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HashSetPairs {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet<String> pairs = new HashSet<>();      
        for(int i=0; i<t; i++){
            pairs.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(pairs.size());
        }
   }
}

/* 
Learnings:
HashSet is a class of java collection framework which helps to 
make hash table data structure.
HashSet<Type> identifier = new HashSet<>();

By default,

the capacity of the hash set will be 16
the load factor will be 0.75

which means,
capacity - 
        The capacity of this hash set is 8. Meaning, it can store 8 elements.
loadFactor - The load factor of this hash set is 0.6. 
        This means, whenever our hash set is filled by 60%, 
        the elements are moved to a new hash table of 
        double the size of the original hash table.

Some useful methods are:
size()
clone()
contains() -- helps to find element in O(1) returns boolean
add() / addAll()
remove() / removeAll()

*/