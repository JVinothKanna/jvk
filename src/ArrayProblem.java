import java.util.*;
public class ArrayProblem {

    public static void main(String[] args) {
        //Integer[] ta = {7,3,1,5,5,5,1,2,4,5};
        /*Integer[] ta = {-2, 4, 1, 5, 2};
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(ta));

        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        rangeSum(A,B);*/

        //subArray();
        //maxProfit1();
        //maxSum();
        //kthsmallest();
        //System.out.println(addBinary("1010110111001101101000","1000011011000000111100110"));
        Integer[] r1 = {21,62,16,44,55,100,16,86,29};
        Integer[] r2 = {62,72,85,35,14,1,89,15,73};
        Integer[] r3 = {42,44,30,56,25,52,61,23,54};
        Integer[] r4 = {5,35,12,35,55,74,50,50,80};
        Integer[] r5 = {2,65,65,82,26,36,66,60,1};
        Integer[] r6 = {18,1,16,91,42,11,72,97,35};
        Integer[] r7 = {23,57,9,28,13,44,40,47,98};

        ArrayList<Integer> r1AL = new ArrayList<>(Arrays.asList(r1));
        ArrayList<Integer> r2AL = new ArrayList<>(Arrays.asList(r2));
        ArrayList<Integer> r3AL = new ArrayList<>(Arrays.asList(r3));
        ArrayList<Integer> r4AL = new ArrayList<>(Arrays.asList(r4));
        ArrayList<Integer> r5AL = new ArrayList<>(Arrays.asList(r5));
        ArrayList<Integer> r6AL = new ArrayList<>(Arrays.asList(r6));
        ArrayList<Integer> r7AL = new ArrayList<>(Arrays.asList(r7));

        ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
        A.add(r1AL);
        A.add(r2AL);
        A.add(r3AL);
        A.add(r4AL);
        A.add(r5AL);
        A.add(r6AL);
        A.add(r7AL);

        //transposeFornonSquareMatrix(A);
        //reverseArray(A);
        transpose(A);
    }

    public static String addBinary(String A, String B) {
        char[] Achar = A.toCharArray();
        char[] Bchar = B.toCharArray();



        int sum = 0;
        int carry = 0;
        int finalSum = 0;
        StringBuilder ans = new StringBuilder();

        for(int i = Achar.length -1, j = Bchar.length -1 ; (i >= 0 || j >= 0) ; i--, j--){
            sum = 0;
            sum += carry;
            if(i >= 0){
                sum += Character.getNumericValue(Achar[i]);
            }
            if(j >= 0){
                sum += Character.getNumericValue(Bchar[j]);
            }

            finalSum = sum%2;
            carry = sum/2;

            ans.append(finalSum);
        }
        if(carry == 1){
            ans.append(carry);
        }

        return ans.reverse().toString();
    }

    public static void kthsmallest() {

        Integer[] ta = {8,16,80,55,32,8,38,40,65,18,15,45,50,38,54,52,23,74,81,42,28,16,66,35,91,36,44,9,85,58,59,49,75,20,87,60,17,11,39,62,20,17,46,26,81,92};
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(ta));
        int B = 9;

        ArrayList<Integer> tempList = new ArrayList<Integer>(A);


        for(int i = 0 ; i < tempList.size() && i < B ; i++){
            int minIndex = i;

            for(int j = i+1 ; j < tempList.size() ; j++){
                if(tempList.get(j) <= tempList.get(minIndex)){
                    minIndex = j;
                }
            }

            int temp = tempList.get(minIndex);
            tempList.set(minIndex,tempList.get(i));
            tempList.set(i, temp);

        }

        System.out.println(tempList.get(B-1));
    }




    public static void maxSum(){
        Integer[] ta = {8,0,10};
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(ta));

        Collections.sort(A);
        int finalSum = 0;

        for(int i = A.size() -1 ; i >= 0 ; i--){
            int sum = 0;
            for(int j = i ; j >= 0; j--){
                sum += A.get(j);
            }
            finalSum += sum;

        }

        System.out.println(finalSum);
    }

    public static void swap(ArrayList<Integer> A, int minIndex, int i){
            int temp = A.get(minIndex);
            A.set(minIndex,A.get(i));
            A.set(i, temp);
    }

    public static void maxProfit(){
        Integer[] ta = {7551982,8124939,4023780,7868369,4412570,2542961,7380261,1164290,7781065,1164599,2563492,5354415,4994454,2627136,5933501,668219,1821804,7818378,33654,4167689,8652323,5750640,9822437,3466466,554089,6168826,335687,2466661,8511732,6288553,2905889,7747975,3744045,1545003,1008624,8041203,7176125,4321092,714053,7200073,166697,7814651,3090485,8318668,6600364,3352620,2430137,7685821,1442555,828955,6540266,5305436,116568,1883410,7975347,9629015,4735259,6559041,1832532,5840170,6983732,5886179,1496505,7241412,144558,9462840,8579314,2488436,9677478,7589124,5636642,2440601,1767332,2399786,6299635,8534665,1367339,805592,5572668,6990026,8465261,4808596,7641452,8464860,3170126,7403200,6932907,3776122,1313688,3992189,2382116,3886952,349816,1596435,7353742,9964868,9882224,3818546,3885458,1200559,3910256,7949895,463872,6392805,9513226,3427933,3470571,6225817,552452,5567651,6414423,6701681,4725847,894529,8046603,426263,5280891,9197661,9764507,1740413,9530261,9163599,7561587,5848442,7312422,4794268,5793465,5039382,5147388,7346933,4697363,6436473,5159752,2207985,8256403,8958858,6099618,2172252,3063342,4324166,3919237,8985768,2703255,2386343,3064166,247762,7271683,1812487,7163753,4635382,449426,2561592,3746615,8741199,6696192,606265,5374062,3065308,6918398,2956279,8949324,2804580,3421479,7846658,8895839,8277589,1262596,451779,9972218,6378556,4216958,7127258,8593578,326883,4737513,6578257,7582654,8675499,9038961,7902676,8874020,5513073,631930,912719,8394492,1508363,455175,9215635,6813970,2021710,5673212,184474,4511247,4653238,2218883,9669544,295018,3694660,1709444,4019025,5047809,45740,1035395,8159408,1557286,1304144,6496263,2094202,9945315,1905585,1143081,6994125,9609830,1077628,3488222,6299366,7187139,3883908,7077292,3210807,7328762,7695314,1138834,7689433,5083719,202831,8138452,5495064,7543763,1597085,5429837,8455839,6925605,6600884,3571512,3422637,8911245,3700762,2338168,6830853,2539094,490627,2294717,497349,8297867,7299269,4769134,285033,4335917,9908413,152868,2658658,3525848,1884044,4953877,8660374,8989154,888731,7217408,2614940,7990455,9779818,1441488,9605891,4518756,3705442,9331226,404585,9011202,7355000,7461968,6512552,2689841,2873446,256454,1068037,8786859,2323599,3332506,2361155,7476810,5605915,5950352,6491737,8696129,4637800,4207476,9334774,840248,9159149,5201180,7211332,3135016,8524857,4566111,7697488,1833291,7227481,8289951,2389102,9102789,8585135,1869227,4082835,8447466,4985240,4176179};
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(ta));

        int result = 0;
        System.out.println(A.size());

         if(A.size() > 0){
            Long stockPriceOnZeroDay = Long.valueOf(A.get(0));

            for(int i = 1 ; i < A.size() ; i++){
                if(Long.valueOf(A.get(i)) > stockPriceOnZeroDay){
                    result++;
                }
            }

        }

        System.out.println(result);

    }

    public static void maxProfit1(){
        int maxProfit = 0;
        int profit = 0;

        Integer[] ta = {1,2};
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(ta));

        if(A.size() > 0){
            int max = 0;

            for(int i = A.size()-1 ; i>=0 ; i--){
                if(A.get(i) > max){
                    max = A.get(i);
                }
                profit = max - A.get(i);
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }

        System.out.println(maxProfit);

    }

    public static void subArray(){
        Integer[] ta = {-2, 4, 1, 5, 2};
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(ta));

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> subArray;

        for(int i = 0 ; i < A.size() ; i++){
            for(int j = 0 ; j < A.size(); j++ ){
                subArray = new ArrayList<Integer>();
                for(int s = i ; s <= j; s++){
                    subArray.add(A.get(s));
                }

                result.add(subArray);
            }
        }

        System.out.print("[");
        for(ArrayList<Integer> aryList : result){
            System.out.print("[");
            for(Integer intr : aryList){
                System.out.print("," + intr);
            }
            System.out.print("]");
        }
        System.out.print("]");

    }
    public static ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {

        Long[] perfixSumArray = new Long[A.size()];
        Long sum = 0L;
        perfixSumArray[0] = Long.valueOf(A.get(0));
        System.out.println( "0" +" "+ perfixSumArray[0]);
        for(int i = 1; i < A.size() ; i++){
            sum = perfixSumArray[i-1] + Long.valueOf(A.get(i));
            perfixSumArray[i] = sum;
            System.out.println( i +" "+ perfixSumArray[i]);
        }

        ArrayList<Long> resultList = new ArrayList();
        
        Integer l = 2;
        Integer r = 4;

        long prefixSum = perfixSumArray[r] -  perfixSumArray[l-1];

        System.out.println("pf " + prefixSum);

        /*for(ArrayList<Integer> lrList : B){
            Integer l = lrList.get(0);
            Integer r = lrList.get(1);

            long prefixSum = perfixSumList.get(r) -  perfixSumList.get(l);

            resultList.add(Long.valueOf(prefixSum));
        }*/

        return resultList;
    }

    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {

        int size = A.size();
        int startCol = 0;
        int startRow = 0;

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        for(int i = 0 ; i < size; i++){
            startCol = i;
            startRow = 0;
            Integer[] tmp = new Integer[size];
            Arrays.fill(tmp,0);

            while(startCol >= 0 && startRow < size){
                tmp[startCol] = A.get(startCol).get(startRow);

                startCol--;
                startRow++;
            }

            ArrayList<Integer> rowResult = new ArrayList<Integer>(Arrays.asList(tmp));

            result.add(rowResult);
        }

        for(int i = 1 ; i < size; i++){
            startRow = i;
            startCol =  size-1;
            Integer[] tmp = new Integer[size];
            Arrays.fill(tmp,0);
            int rowIndex = 0;
            while(startRow < size && startCol > 0){
                tmp[rowIndex] = A.get(startRow).get(startCol);
                startRow++;
                startCol--;
                rowIndex++;
            }

            ArrayList<Integer> rowResult = new ArrayList<Integer>(Arrays.asList(tmp));

            result.add(rowResult);
        }

        return result;
    }

    public static ArrayList<ArrayList<Integer>> transposeForSquareMatrix(ArrayList<ArrayList<Integer>> A){
        int rowSize  = A.get(0).size();
        for(int i = 0; i < A.size(); i++){
            for(int j = i+1 ; j < rowSize ; j++){
                int tmp = A.get(j).get(i);
                A.get(j).set(i, A.get(i).get(j));
                A.get(i).set(j, tmp);
            }
        }
        for(ArrayList<Integer> al : A){
            System.out.print("{");
            for(Integer x : al){
                System.out.print(x +",");
            }
            System.out.print("}");
            System.out.println();

        }

        return A;

    }

    public static ArrayList<ArrayList<Integer>> transposeFornonSquareMatrix(ArrayList<ArrayList<Integer>> A) {
        int rowSize  = A.get(0).size();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(rowSize);
        for(int i = 0; i < rowSize; i++){
            ArrayList<Integer> tmp = new ArrayList<Integer>(A.size());
            for(int j = 0 ; j < A.size() ; j++){
                tmp.add(A.get(j).get(i));
            }
            result.add(tmp);
        }

        return result;
    }

    public static void reverseArray(ArrayList<ArrayList<Integer>> A){
        int size = A.size();
        int rowSize = A.get(0).size();
        //ArrayList<ArrayList<Integer>> reverseArray = new ArrayList<ArrayList<Integer>>(size);
        ArrayList<Integer> rowAryLst;

        for(int col = 0 ; col < size ; col++){
            rowAryLst = A.get(col);
            for(int row = 0 ; row < rowSize/2; row++){
                Integer tmp = rowAryLst.get(row);
                rowAryLst.set(row, rowAryLst.get(rowSize - row -1));
                rowAryLst.set(rowSize - row -1, tmp);
            }
        }

        for(ArrayList<Integer> al : A){
            System.out.print("{");
            for(Integer x : al){
                System.out.print(x +",");
            }
            System.out.print("}");
            System.out.println();

        }

    }


    public static ArrayList<ArrayList<Integer>> transpose(ArrayList<ArrayList<Integer>> A){

        int size = A.size();
        int rowSize = A.get(0).size();
        ArrayList<ArrayList<Integer>> transposedArray = new ArrayList<ArrayList<Integer>>(size);
        ArrayList<Integer> temp;

        for(int row = 0 ; row < rowSize; row++){
            temp = new ArrayList<Integer>(size);
            for(int col = 0 ; col < size ; col++){
                temp.add(A.get(col).get(row));
            }
            transposedArray.add(temp);

        }

        A.removeAll(A);
        A.addAll(transposedArray);

        for(ArrayList<Integer> al : A){
            System.out.print("{");
            for(Integer x : al){
                System.out.print(x +",");
            }
            System.out.print("}");
            System.out.println();

        }

        return A;

    }


}
