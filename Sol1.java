import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Sol1 {

      // If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
      // Find the sum of all the multiples of 3 or 5 below 1000.
      
      public static void main(String args[]) {
        List<Integer> numsToSum = new ArrayList<>();
        
        IntStream.range(1, 1001).forEach(num -> {
            if (num % 3 == 0 || num % 5 == 0) {
                numsToSum.add(num);
            }
        });
        
        Integer result = numsToSum.stream().mapToInt(Integer::intValue).sum();
        System.out.println(result);
    }
}
