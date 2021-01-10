import java.util.*;
public class Subs {
    public static int getHeight(ArrayList<Integer> L, int N, int K, int total){
        if(2*K > total) return -1;
        
        int currentSum = total;
        
        
        int minDiff = Integer.MAX_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();;
        for(int mask=0; mask < (1<<N); mask++){
            int sum=0;
            ArrayList<Integer> subArr = new ArrayList<>();
            for(int i=0; i<N; i++){
                if((mask & 1<<i)==0){
                    int val = L.get(i);
                    sum += val;
                    subArr.add(val);
                }
            }
            if(sum==K){
                minDiff = sum - K;
                ans = (ArrayList<Integer>)subArr.clone();
            }else if(sum>K && sum-K < minDiff){
                minDiff = sum - K;
                ans = (ArrayList<Integer>)subArr.clone();
            }
        }
        // System.out.println("Set A : "+ans);
        int count=0;
        int vajan = ans.size();
        for(int k=0; k<vajan; k++){
            int z = ans.get(k);
            L.remove(Integer.valueOf(z));
            currentSum -= z;
            count++;
        }
        // System.out.println("Remains for setB : "+L);
        if(currentSum<K) return -1;
        
        int sumB=0;
        while(sumB<K){
            sumB += L.remove(0);
            count++;
        }
        return count;
    }
    public static void main(String args[]) {
        ArrayList<Integer> something = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int total=0;
            for(int i=0; i<N; i++){
                int H = sc.nextInt();
                total += H;
                something.add(H);
            }
            something.sort(Comparator.reverseOrder());
            int p = getHeight(something, N, K, total);
            System.out.println(p);
        }
    }
}