import streamsExample.ATestInterface;
import streamsExample.BTestInterface;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class STest implements BTestInterface {

    static int i = 0;

    public static  void main(String[] args) {
        //Integer[] temp = {88,17,136,179,160,111,169,49,93,163,186,59,115,92,166,109,170,72,192,83,45,5,21,66,66,168,109,174,116,89,30,154,68,149,57,99,68,139,67,69,131,88,46,164,100,27,181,44,70,145,59,19,45,18,157,137,32,47,129,9,91,117,24,139,46,42,136,145,169,199,183,142,60,156};
        /*Integer[] temp = {28,181,129,28,142,137,159,119,121,3,65,101,42,168,185,96,59,51,143,69,8, 181,164,117,72,162,81,110,163};
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(temp));
        int B = 11;
        System.out.println(solve(A,B));*/
        /*
         ExecutorService es = Executors.newCachedThreadPool();
        es.submit(()-> {
            System.out.println("Hi ");
        });
         */
       /* ATestInterface a;
        BTestInterface b;
        m(null,null);
        m(a=null, b=null);
        m(b,a);*/

        /*
          STest s = new STest();
          s.ch();
        System.out.println(i);
         */



        //test3();




    }

    public void ch(){
        i=1;
    }

   public static int solve(ArrayList<Integer> A, int B) {
        int sum=0;
        ArrayList<Integer> aryList = (ArrayList<Integer>) A.clone();

        for(int i=0; i<A.size()-2;i++){
            Integer tmp = A.get(i);
            aryList.remove(tmp);
            if(tmp < Integer.valueOf(B)){
                for(int j=0; j<aryList.size();j++){
                    if(aryList.get(j) < Integer.valueOf(B)) {
                        if (Integer.valueOf(B).equals(tmp + aryList.get(j))) {
                            sum = 1;
                        }
                    }
                }
            }
            System.out.println();

        }

        return sum;
    }

   /* public static int solve(ArrayList<Integer> A) {
        int result = 0;

        for(int i=0; i < A.size()-1; i++){
            if(A.get(i) < A.get(i+1)){
                result = 1;
            }else{
                result = 0;
                break;
            }

        }

        return result;
    }*/

    /*public static ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = A.size()-1 ; i >= 0 ; i--){
            result.add(A.get(i));
        }
        return result;
    }*/

    public static void test() throws InterruptedException {
        String s1 = "abc";
        long l1= System.identityHashCode(s1);
        System.gc();
        Thread.sleep(1000);
        String s2 = "abc";
        long l2= System.identityHashCode(s2);
        System.out.println("Hash code " + (l1==l2));
        System.out.println("String " + (s1 == s2));
    }

    public static void test2(){
        List<List<String>> inputList = Arrays.asList(
                Arrays.asList("sample1","Test1"),
                Arrays.asList("sample2","Test2"),
                Arrays.asList("sample3","Test3"),
                Arrays.asList("sample4","Test4")
        );

        List<String> result = inputList.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(result);
    }

    public static void test3(){
        int[] intAry = {7,2,6,3,8,1,3,6};
        List<Integer> tst= Arrays.stream(intAry).mapToObj(i -> i).collect(Collectors.toList());
        List<List<Integer>> result = new ArrayList<>();
        //IntStream.range(0, intAry.length).forEach(i -> System.out.println(intAry[i]));
        IntStream.range(0, intAry.length -1).parallel().forEach(i -> {
            List<Integer> tempList = new ArrayList<>();
            int temp = intAry[i]+ intAry[i+1];
            int j= i;
            j++;
            if(temp == 9){
                tempList.add(i);
                tempList.add(j);
                result.add(tempList);
            }


            //System.out.println(temp);
        });
        System.out.println(result);

    }

    public static void m(ATestInterface a1,  ATestInterface a2){
        System.out.println("1");
    }

    public static void m(ATestInterface a,  BTestInterface b){
        System.out.println("2");
    }

    public static void m(BTestInterface b,  ATestInterface a){
        System.out.println("3");
    }

    public static void m(BTestInterface b1,  BTestInterface b2){
        System.out.println("4");
    }
}
