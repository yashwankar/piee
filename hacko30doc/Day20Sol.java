import java.util.Scanner;
public class Day20Sol {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int num=0; num < n; num++){
            a[num] = in.nextInt();
        }
        int numSwaps=0;
        for(int i=0; i<a.length-1; i++){
            for(int j=0; j<a.length-1; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    numSwaps+=1;
                }
            }
        }
        int firstElement = a[0];
        int lastElement = a[a.length-1];
        System.out.println("Array is sorted in "+ numSwaps + " swaps.");   
        System.out.println("First Element: " + firstElement); 
        System.out.println("Last Element: " + lastElement); 
    }
}
/*
Learnings:
Basics of Bubble sort
both inner and outer loop ranges from 
zero to length-1 
*/