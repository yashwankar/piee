import java.util.Scanner;
import java.util.regex.*;

public class PatternCheck
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases-- >0){
			String pat = in.nextLine();
            try{
                Pattern.compile(pat);
                System.out.println("Valid");
            }catch(Exception e){
                System.out.println("Invalid");
            }
		}
	}
}
/*
Learnings:
this is a basic demonstration to check if the Pattern.compile 
can successfully compile a regex or not
if not then it will generate exception which will be handled by the program
*/