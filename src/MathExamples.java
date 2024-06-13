import java.util.*;
import java.util.stream.Collectors;

public class MathExamples {
    public static  void main(String[] args) {
        //solve(8);
        //solve1(355);
        //power(2,3);
        //bill();
        //System.out.println(isPrime(4));
        //System.out.println(isPerfectNumber(6));
        //maxMinElement();
        List<ArrayList<Integer>> a = new ArrayList<>();
        ArrayList<Integer> aryLst = new ArrayList<Integer>();
        aryLst.add(1);
        aryLst.add(0);
        a.add(aryLst);
        ArrayList<Integer> aryLst1 = new ArrayList<Integer>();
        aryLst1.add(0);
        aryLst1.add(1);
        a.add(aryLst1);

        /*HashMap<Integer,Integer> tmp = new HashMap<Integer,Integer>();
        for(Map.Entry<Integer, Integer> me: tmp.entrySet()){
            me.getValue();
        }*/



        /*Integer[] ta = {888,417,136,979,360,711,569,992,693,763,589,259,992};
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(ta));

        Integer[] tb = {4313903, 6215954, 6269430, 197583, 2222452, 7123477, 6928329, 6639314,271742,392145,766235,8494643,992645,5444656,9773571};
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(tb));*/



       /* System.out.println(findSumInArray(B, 13567643));*/

        Integer[] ta = {1,1,4,9,4,7,1};
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(ta));
        //System.out.println(rotateArray(A,9));

        System.out.println(Integer.MIN_VALUE);

        //System.out.println(reverseArray(A, 0, 3));

        //System.out.println(frequency1(A,B));

      /*  HashMap<String, Integer> H = new HashMap<>();
        H.put("India", 12);
        H.put("Pakistan", 8);
        H.put("China", 9);

        int K = 10;

        System.out.println(population(H, K));*/

        //findPrefectSquare(16);

        /*System.out.println(test1(24));
        Scanner scn = new Scanner(System.in);
        scn.next();*/

    }

    public static double solve(int A) {
        double area = 3.1416 *A*A;
        System.out.println("Area " + area);
        return Math.round(area*100.0)/100.0;
    }

    public static int solve1(final int A) {
        double VolumeOfSphere = (4*Math.PI*A*A*A)/3;
        return (int) Math.ceil(VolumeOfSphere);
    }

    public static int power(final int A, final int B) {
        int power = A;
        for(int i = 1; i <= B; i++){
            power = power*A;
        }
        return power;
    }

    public static void bill(){
        int unit = 221;

        double amount = 0;
        if(unit > 0 && unit <= 50){
            amount = unit * 0.5;
        }else if(unit > 50 && unit <=  150){
            amount = ( 50 * 0.5 ) + ((unit - 50) * 0.75);
        }else if(unit > 150 && unit <=  250){
            amount = ( 50 * 0.5 ) + (100 * 0.75) + ((unit - 150) * 1.2);
        }else if(unit > 250){
            amount = ( 50 * 0.5 ) + (100 * 0.75) + (100 * 1.2) + ((unit - 250) * 1.5);
        }


        amount = amount + (amount*0.2);
        System.out.println(Math.round(amount*100)/100);
    }

    public static boolean isPrime(int n){
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static String isPerfectNumber(int m){

        int sum = 0;
        for(int i = 1; i <= m/2 ; i++){
            if(m%i == 0){
                sum += i;
            }
        }

        if(sum != m){
            return "NO";
        }else{
            return "YES";
        }

    }

    public static void maxMinElement(){
        int[] inputArray = {2,3,1,4,2};

        int min = inputArray[0];
        int max = inputArray[0];

        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i] < min ){
                min = inputArray[i];
            }

            if(inputArray[i] > max ){
                max = inputArray[i];
            }
        }

        System.out.print(max +" " + min);
    }

    public static int identityMatrix(final List<ArrayList<Integer>> A) {
        boolean diagonalOne = false;
        boolean otherElement = false;

        for(int i = 0; i < A.size(); i++){

            ArrayList<Integer> aryLst =  A.get(i);

            for(int j = 0; j < aryLst.size(); j++){
                if(i == j ){
                    if(aryLst.get(j) == 1){
                        diagonalOne = true;
                    }else{
                        diagonalOne = false;
                        break;
                    }

                }else{
                    if(aryLst.get(j) == 0){
                        otherElement = true;
                    }else{
                        otherElement = false;
                        break;
                    }

                }


            }

            if(!diagonalOne || !otherElement){
                break;
            }
        }

        if(diagonalOne && otherElement){
            return 1;
        }else{
            return 0;
        }


    }

    public static ArrayList<Integer> frequency(ArrayList<Integer> A, ArrayList<Integer> B) {

        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new  ArrayList<Integer>();

        for(Integer intg : B){
            if(!hs.containsKey(intg)){
                if(A.contains(intg) ){
                    for(int i = 0; i< A.size(); i++){
                        if(A.get(i).equals(intg) ){
                            if(hs.containsKey(A.get(i))){
                                hs.put(A.get(i), hs.get(A.get(i))+1);
                            }else{
                                hs.put(A.get(i), 1);
                            }
                        }
                    }
                }else{
                    hs.put(intg, 0);
                }
            }
        }

        for(Integer intg : B){
            result.add(hs.get(intg));
        }

        return result;


    }

    public static ArrayList<Integer> frequency1(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new  ArrayList<Integer>();

        for(Integer intg : B){
            if(!hs.containsKey(intg)) {
                if (A.contains(intg)) {
                    hs.put(intg, Collections.frequency(A, intg));
                } else {
                    hs.put(intg, 0);
                }
            }

        }



        for(Integer intg : B){
            result.add(hs.get(intg));
        }

        return result;

    }

    public static int population(HashMap<String, Integer> H, int K){

        int count = 0;
        for(String  tmp : H.keySet()){
            if(H.get(tmp) <= Integer.valueOf(K)){
                count++;
            }
        }
        return count;

    }

    public static void findPrefectSquare(int num){
        boolean isPerfectSquare = false;

        for (int i = 1; i <= num / 2; i++) {
            if (i * i == num) {
                isPerfectSquare = true;
                break;
            }
        }

        if (isPerfectSquare) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
    }

    public static int test1(int A) {
        int sum = 0;
        int result = 0;
        if(A > 1){
            for(int i=1 ;  i <A ; i++){
                if(A%i == 0){
                    sum += i;
                }
                if(sum == A){
                    result = 1;
                    break;

                }
            }
        }

        if( sum == A ){
            return 1;
        }else{
            return 0;
        }
    }

    public static int findSumInArray(ArrayList<Integer> A, int B) {
        int count = 0;
        for(int i = 0; i < A.size(); i++ ){
            if( A.get(i) < B){
                for(int j = i+1; j < A.size(); j++ ){
                    if(i != j && A.get(j) < B ){
                        if(((A.get(i) + A.get(j)) == B)){
                            count++;
                        }
                    }
                }

            }

        }
        return count;
    }

    public static ArrayList<Integer> reverseArray(ArrayList<Integer> A, int B, int C) {
        int i = B;
        int j = C;
        while(i < j){
            int temp = A.get(i);
            A.set(i, A.get(j));
            A.set(j, temp);
            i++;
            j--;
        }

        return A;
    }

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> intArray, int k){
        int size = intArray.size();
        if(k >= intArray.size()){
            k = k % size;
        }
        for(int x = 0; x < k ; x++){
            int tmp = intArray.get(0);
            for(int i = 0; i < intArray.size()-1; i++){
                intArray.set(i, intArray.get(i+1));
            }
            intArray.set(intArray.size()-1, tmp);
        }


        return intArray;
    }


}
