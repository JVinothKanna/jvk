package streamsExample;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static int printSecondLargestnumber(ArrayList<Integer> intAryList){
        List<Integer> result = intAryList.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(result);
        return result.get(1);

    }
    public static void main(String arg[]){
        Integer[] temp = {8,5,11,16,5,10};
        ArrayList<Integer> intAryList = new ArrayList<>(List.of(temp));
        System.out.println(printSecondLargestnumber(intAryList));
    }
}
