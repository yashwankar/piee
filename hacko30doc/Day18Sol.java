import java.io.*;
import java.util.*;
public class Day18Sol {
    Stack<Character> stk = new Stack<>();
    Queue<Character> que = new LinkedList<>();
    void pushCharacter(char c){
        stk.push(c);
    }
    void enqueueCharacter(char c){
        que.add(c);
    }
    char popCharacter(){
        return stk.pop();
    }
    char dequeueCharacter(){
        return que.remove();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
/*
Learnings: 
Queue is an abstract data type which can not be instantiated.
It can be implemented using:
LinkedLists or ArrayDeque or PriorityQueue.
It has methods :
add()
offer()
element()
peek()
remove()
poll()


Stack extends the vector class.
It CAN BE instantiated as
Stack<Type> stacks = new Stack<>();
Some methods includes:
push()
pop()
peek()
search()
empty()
*/