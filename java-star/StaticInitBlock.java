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

The major advantage is to use these blocks is that it allows us to make specific initial values
to the class variables based on some conditionals or error handling block.

It is like giving some entry to blueprint form only when it passes some condition.
Also, the data members used in this block must be declared as static beforehand.
like, static <datatype> <varname>;

otherwise, the main funtion will show the static members can not be accessed by
non-static data types.
error: non-static variable <varname> cannot be referenced from a static context

The syntax for declaring static initialization blocks are:
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