package streamsExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static java.util.stream.Collectors.*;

public class Altxm {
    public static Integer findMaxSalary(int[] input){
        final Integer integer;
        integer = Arrays.stream(input).distinct().mapToObj(i->(Integer)i).sorted(Collections.reverseOrder()).collect(toList()).get(1);
        return integer;
    }


    public static void main(String[] arg){
       int[] input = {2,4,7,40,30,7,40,73};
        Integer reslut = findMaxSalary(input);
        System.out.println(reslut);
    }

}
