package streamsExample;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;


public class StringIntegerCount {

    public static long countUniqueCharCount(String test){
        HashMap<Character, Integer> charCount = new HashMap<>();
        test.chars().mapToObj(i -> (char)i).forEach(c -> {
            if(charCount.containsKey(c)){
                int temp = charCount.get(c);
                temp++;
                charCount.put(c,temp);
            }else{
                charCount.put(c,1);
            }
        });

        return charCount.entrySet().stream().filter(e -> e.getValue() == 1).count();
    }

    public static int[] printHighestRepeatingsequence(int[] intAry){
        LinkedHashMap<Integer, Integer> SortedMap = new LinkedHashMap<>();
        HashMap<Integer, Integer> intAryCount = new HashMap<>();
        Arrays.stream(intAry).forEach(i -> {
                if(intAryCount.containsKey(i)){
                    int temp = intAryCount.get(i);
                    temp++;
                    intAryCount.put(i,temp);
                }else{
                    intAryCount.put(i,1);
                }
        });

        SortedMap = intAryCount.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap<Integer,Integer>::new));

        ArrayList<Integer> intList = new ArrayList<>();
        SortedMap.entrySet().stream().forEach(e -> {
            int key = e.getKey();
            int value = e.getValue();
            System.out.println("Key: " + key + "Value: "+ value);
            for(int i = 0; i < value; i++){
                intList.add(key);
            }
        });

        return intList.stream().mapToInt(i -> i).toArray();
    }

    public static int[] printHighestRepeatingsequence2(int[] intAry){
        LinkedHashMap<Integer, Integer> SortedMap = new LinkedHashMap<>();
        Map<Integer, Long> intAryCount = new HashMap<>();
        Map<Integer, Integer> sortIntAryCount = new HashMap<>();
        /*Arrays.stream(intAry).forEach(i -> {
            if(intAryCount.containsKey(i)){
                int temp = intAryCount.get(i);
                temp++;
                intAryCount.put(i,temp);
            }else{
                intAryCount.put(i,1);
            }
        });*/



        intAryCount = Arrays.stream(intAry).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        /*sortIntAryCount = intAryCount.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(toMap());
                LinkedHashMap::new));*/






        ArrayList<Integer> intList = new ArrayList<>();
        sortIntAryCount.entrySet().stream().forEach(e -> { int key = e.getKey();
                                              int value = Math.toIntExact(e.getValue());
                                              for(int i = 0; i < value ; i++){
                                                  intList.add(key);
                                              }
                                            });
        Collections.sort(intList,Collections.reverseOrder());

        return intList.stream().mapToInt(i -> i).toArray();

    }


    public static void main(String[] arg){
        //System.out.println(cou
        // ntUniqueCharCount("aseeeddfrrg"));
        Arrays.stream(printHighestRepeatingsequence2(new int[]{3, 5, 5, 8, 6, 5, 8, 1, 8, 4, 3, 2, 3})).forEach(i -> System.out.println(i));
    }
}
