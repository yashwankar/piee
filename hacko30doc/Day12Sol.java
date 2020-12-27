import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    Student(String firstName, String lastName, int id, int[] scores){
        super(firstName, lastName, id);
        this.testScores = scores;
    }
    char calculate(){
        int total=0, avg;
        for(int i=0; i<testScores.length; i++){
            total+=testScores[i];
        }
        avg=total/testScores.length;
        if(avg>=90 && avg<=100)
            return 'O';
            else{
            if(avg>=80 && avg<90)
                return 'E';
                else{
                if(avg>=70 && avg<80)
                    return 'A';
                    else{
                    if(avg>=55 && avg<70)
                        return 'P';
                        else{
                            if(avg>=40 && avg<55)
                                return 'D';
                            else 
                                return 'T';
                        }
                    }
                }
            }
        
    }
}

class Day12Sol {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}

/*
Learnings:
1) Calling super class properties using inheritance.
2) getters and setters in classes.
3) passing array to a function
4) declaring separate base class instance variables

5) Additionally,
 Static methods in Java are inherited, but can not be overridden. 
 If you declare the same method in a subclass, 
 you hide the superclass method instead of overriding it.
*/