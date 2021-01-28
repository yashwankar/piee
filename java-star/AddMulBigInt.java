import java.util.Scanner;
import java.math.BigInteger;

public class AddMulBigInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        
        BigInteger first = new BigInteger(a);
        BigInteger second = new BigInteger(b);
        
        System.out.println(first.add(second));
        System.out.println(first.multiply(second));
        
    }
}

/*
Learnings:
BigInteger is defined in java.math.BigInteger.
It takes string value in its default contructor.

it has methods like:
    obj1.add(obj2)
    obj1.multiply(obj2)
    obj1.divide(obj2)
    obj1.gcd(obj2)
    obj1.nextProbablePrime()

    other methods include pow, setBit, xor, not,
    shiftLeft, abs, equals, mod.
*/