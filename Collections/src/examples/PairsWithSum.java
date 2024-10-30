package examples;

import java.util.HashSet;
import java.util.Set;
 
public class PairsWithSum {
   public static void main(String[] args) {
       int[] arr = {2, 4, 3, 5, 7, 8, 9};
       int target = 10;
      Set<Integer> set = new HashSet<>();
       for (int num : arr) {
           int complement = target - num;
           if (set.contains(complement)) {
              System.out.println("(" + complement + ", " + num + ")");
           }
          set.add(num);
       }
   }
}

