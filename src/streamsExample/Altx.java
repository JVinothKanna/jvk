package streamsExample;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Altx {
    /*public static void printNumAcc(String input){
        char[] inpuChr = input.toCharArray();
        HashMap<String, Long> result = new HashMap<>();
        result = (HashMap<String, Long>) Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        result.entrySet().stream().forEach(e-> System.out.println(e.getKey() +""+e.getValue() ));

    }*/

    public static void main(String arg[]){
        //printNumAcc("jvinothkanna");
        countofStrings("alex brian charles alex charles david eric david");
    }

    private static void printNumAcc(String input) {
       Map<Character, Long> result = input.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        System.out.println(result.get('n'));
    }

    private static void countofStrings(String line){
        Map<String, Long> result = Arrays.stream(line.split("[^a-zA-Z0-9]+")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
    }
}
