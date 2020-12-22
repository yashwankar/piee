import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitBlock {
    private static final Scanner sc = new Scanner(System.in);
    static int B, H;
    static boolean flag=false;
    
    static{
    B=sc.nextInt();
    H=sc.nextInt();
    if(B<=0 || H<=0)
    System.out.println("java.lang.Exception: Breadth and height must be positive");
    else
    flag=true;
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

/*
Learnings:

The class variables can be made static.
but for the initialization of those variables with some value
if there is some kind of calculation involved like if else conditionals, try catch exceptional handling
in that case the static initializer block is used.

static{
    //operations
}

Instance variables can be initialized in constructors, where error handling or other logic can be used. 
To provide the same capability for class variables, the Java programming language includes static initialization blocks.

There is an alternative to static blocks — you can write a private static method:
class Whatever {
    public static varType myVar = initializeClassVariable();
        
    private static varType initializeClassVariable() {
        // initialization code goes here
    }
}

*/