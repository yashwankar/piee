import java.math.BigInteger;
import java.util.Scanner;
public class isProbablePrime {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String n = sc.nextLine();
        sc.close();
        BigInteger a = new BigInteger(n);
        System.out.println((a.isProbablePrime(1) ? "prime" : "not prime"));
    }
}
/*
Learnings:
One of the good way to check big number to be prime or not

    boolean isProbablePrime(int certainty)  
    where, certainity is a measure caller is willing to tolerate.
    if the call returns true the probability that this BigInteger 
    is prime exceeds (1 - (1/2)^certainty). 
    The execution time of this method is proportional to the value of this parameter.

    So, higher the value, it will be close to 1.
    If certainty <= 0 , true is returned.

    internally this is done by performing Miller-Rabin primality tests, 
    the number of which is based on certainty (and a Lucas-Lehmer test).

    This method returns a Boolean value 'true' 
    if and only if this BigInteger is prime else for composite values it return false.


*/