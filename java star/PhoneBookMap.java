import java.util.*;
import java.io.*;

class PhoneBookMap{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        Map<String, Integer> phonebook = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            phonebook.put(name, phone);   
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(phonebook.containsKey(s)){
                System.out.printf("%s=%d%n", s, phonebook.get(s));
            }
            else
                System.out.println("Not found");
        }
        in.close();
	}
}

/* 
Learnings:
Map is abtract it can not be inherited.

(Map object) phonebook.get methods returns the key not the object,
so can use that directly in the fuctions.

(Scanner object) in.hasNext() can be used to take input till user inputs.
*/