import java.math.BigDecimal;
import java.util.*;
class DecreasingBigInt{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                BigDecimal a = new BigDecimal(s[j]);
                BigDecimal b = new BigDecimal(s[j+1]);
                if(a.compareTo(b) == 0)
                    continue;
                if(a.compareTo(b) < 0){
                    String temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }
            }
        }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}

/* 
Learnings:
BigDecimal is a class for for arithmetic, comparison, hashing, rounding, manipulation and format conversion.
It has methods like : 
    abs, divide, equals, compareTo, hashCode,
    intValue, intValueExact, round, pow, scale, 
    valueOf, toBigInteger, 

*/