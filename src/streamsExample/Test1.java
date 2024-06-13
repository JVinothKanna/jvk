package streamsExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    private static ArrayList<List<Integer>> finalResult = new ArrayList<List<Integer>>();
    public static void printEvenNuber(int[] intArray){
        int result = Arrays.stream(intArray).boxed().filter(i -> i%2 == 0)
                .reduce((integer, integer2) -> integer+integer2).get();
        System.out.println(result);
    }

    public static void subArray(int[] arry, int start,int end ){
        if(start >= arry.length) {
            return;
        }else if(start > end) {
            subArray(arry, 0, end + 1);
        }else{
            ArrayList<Integer> result = new ArrayList<Integer>();
            for(int i = start; i<=end; i++){
                result.add(arry[i]);
            }
            finalResult.add(result);

        }

        subArray(arry, start+1, end);

    }

    public static void main (String[] args) {
        int[] intArry = {1,2,3,4};
        //printEvenNuber(intArry);
        subArray(intArry, 0,0);
        System.out.println(finalResult);
    }
}
