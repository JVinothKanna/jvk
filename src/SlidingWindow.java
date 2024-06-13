import java.util.Arrays;

public class SlidingWindow {
    public static void main(String[] arg){
        int[] ary = {1,2,6,2,4,1};
        int k = 3;
        System.out.println(findMaxSum(ary,k));
    }

    public static int findMaxSum(int[] ary, int k){
        if(k > ary.length){
            return -1;
        }

        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += ary[i];
        }

        int maxSum = sum;
        int temp = 0;

        for(int i = 1; i < ary.length-(k-1); i++){
            int totalSum = ary[i+k-1] - ary[i-1];
            sum = sum + totalSum;
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    public int findMaxValueSubArray(int[] ary){

        int maxSum = Arrays.stream(ary).sum();
        int maxSubArray = 0;
        return maxSum;
    }
}
