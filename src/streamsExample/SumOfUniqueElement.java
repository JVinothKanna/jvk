package streamsExample;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfUniqueElement {
    public static void main(String arg[]){
        int[] inputArray= {1,3,4,6,7,9,4,1,7};
        System.out.println(sumOfUniqueElementInArray(inputArray));

    }

    public static int sumOfUniqueElementInArray(int[] inputArray){
        return Arrays.stream(inputArray)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey())
                .mapToInt(i -> i)
                .sum();

    }
}
