import java.io.*;
import java.util.*;

public class Day4sol {
    private int age;	
  
	public Day4sol(int initialAge) {
  		if(initialAge>=0)
          this.age = initialAge;
        else{
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
	}

	public void amIOld() {
        if(age<13)
        System.out.println("You are young.");
        else{
            if(age>=13 && age<18)
            System.out.println("You are a teenager.");
            else{
                if(age>=18)
                System.out.println("You are old.");
            }
        }
	}

	public void yearPasses() {
  		this.age+=1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Day4sol p = new Day4sol(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}

/*
in this case, the Person class name is being renamed as Day4sol

Learnings:
this keyword to change the value of an instance.

getters and setters basic syntax is:
class MyClass{
    dataType instanceVariable;
    ...
    void setInstanceVariable(int value){
        this.instanceVariable = value;
    }
    dataType getInstanceVariable(){
        return instanceVariable;
    }
}

constructors:- default and parameterized

A parenthetical variable in a function or constructor declaration (e.g.: in int methodOne(int x), the parameter is int x).

The actual value of a parameter (e.g.: in methodOne(5), the argument passed as variable x is 5

*/