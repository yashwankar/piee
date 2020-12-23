import java.util.*;
import java.io.*;
class Day8Sol{
    public static void main(String []argh){
        Map<String, Integer> phonebook = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phonebook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(phonebook.containsKey(s))
                System.out.printf("%s=%d%n",s,phonebook.get(s));
            else 
                System.out.println("Not found");
        }
        in.close();
    }
}

/* 
Learnings:

Map is an interface that provides a blueprint for data structures that 
take (key, value) pairs.
It can be done using HashMap or LinkedHashMap

Declare a String to String map
Map<String, String> myMap; 

Initialize it as a new String to String HashMap
myMap = new HashMap<String, String>();  

Change myMap to be a new (completely different) String to String LinkedHashMap instead
myMap = new LinkedHashMap<String, String>();


containsKey(Object key): Returns true if the map contains a mapping for key; returns false if there is no such mapping.

get(Object key): Returns the value to which the key is mapped; returns null if there is no such mapping.

put(K key, V value): Adds the (Key, Value) mapping to the Map; if the key is already in the map, the value is overwritten.

*/