import java.util.Scanner;
class Difference {
  	private int[] elements;
  	public int maximumDifference;
    Difference(int[] arr){
        elements = new int[arr.length];
        maximumDifference=0;
        for(int i=0; i<arr.length; i++)
            elements[i] = arr[i];
    }
    public void computeDifference(){
        for(int i=0; i<elements.length-1; i++){
            for(int j=i+1; j<elements.length; j++){
                int diff = elements[i] - elements[j];
                if(diff<0) diff = -diff;
                if(diff>maximumDifference) maximumDifference=diff;
            }
        }
    }
} 

public class Day14Sol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        Difference difference = new Difference(a);
        difference.computeDifference();
        System.out.print(difference.maximumDifference);
    }
}

/*

Learnings:
1) Constructors have their own separate scope.
2) It is good to assign/access instance variables using this keyword.
3) NullPointerException shows when trying to access index of array without initializing its size.
    java. lang. NullPointerException is thrown when a reference variable is accessed (or de-referenced) 
    and is not pointing to any object.

4) This specific program can be solved in O(n) as:
    running a loop and in that very loop calculating min and max values simultaneously.
    and finally maximumDifference will be the difference between those two values.

5) Array requires memory for work, it can be assigned using new keyword.

*/