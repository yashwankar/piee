import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'nearlySimilarRectangles' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts 2D_LONG_INTEGER_ARRAY sides as parameter.
     */

    public static long nearlySimilarRectangles(List<List<Long>> sides) {
    // Write your code here
    long res=0;
    for(int i=0; i<sides.size()-1; i++){
        for(int j=0; j<sides.size()-1; j++){
            if(i==j) continue;
            if((double)sides.get(i).get(0)/sides.get(j).get(0) == (double)sides.get(i).get(1)/sides.get(j).get(1))
            res+=1;
        }
    }
    return res;
    }

}
public class NearlySimilarRect {
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int sidesRows = sc.nextInt();
        int sidesColumns = sc.nextInt();

        List<List<Long>> sides = new ArrayList<>();
        for(int i=0; i<sidesRows; i++){
            long a=sc.nextLong();
            long b=sc.nextLong();
            List temp=new ArrayList();
            temp.add(a);
            temp.add(b);
            sides.add(temp);
        }


        // IntStream.range(0, sidesRows).forEach(i -> {
        //     try {
        //         sides.add(
        //             Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //                 .map(Long::parseLong)
        //                 .collect(toList())
        //         );
        //     } catch (IOException ex) {
        //         throw new RuntimeException(ex);
        //     }
        // });

        long result = Result.nearlySimilarRectangles(sides);
        System.out.println(result);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}