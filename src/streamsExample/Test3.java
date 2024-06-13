package streamsExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test3 {

    public static List<Integer> removeDuplicates(int[] inputArray){
       return Arrays.stream(inputArray).boxed().distinct().collect(Collectors.toList());
    }

    public static void main(String[] arg){
        int[] input = {7,7,1,5,8,8,3,4,2,2};
        System.out.println(removeDuplicates(input));
    }
}
