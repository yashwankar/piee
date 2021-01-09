import java.util.Scanner;

public class Day25Sol {
    static boolean prime(int n){
        if (n<2) return false;
        for(int i=2; i*i<n ; i++)
            if(n%i == 0) return false;
        return true;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            if(prime(n)==true)
                System.out.println("Prime");
            else System.out.println("Not prime");
        }
    }
}
