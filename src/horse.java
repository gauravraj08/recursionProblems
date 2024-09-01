import java.util.ArrayList;
import java.util.List;

public class horse {
//    static void solve(int[] arr,int n,int target){
//        int sum=0,size=0;
//        int dupT=target;
//        List<Integer> ds=new ArrayList<>();
//        int i=0;
//        while(i<n){
//            sum+=arr[i];
//            ds.add(arr[i]);
//            if(sum<dupT) {
//                size=Math.max(size, ds.size());
//                i++;
//            }
//            else{
//                ds=new ArrayList<>();
//                sum=0;
//                i--;
//            }
//        }
//        System.out.println(size);
//    }

    static int solve(int[] prices,int N, int K) {
        int start = 0, currentSum = 0, maxLength = 0;

        for (int end = 0; end < N; end++) {
            currentSum += prices[end]; // Expand the window by adding the current price

            // Shrink the window from the left if the current sum is greater than or equal to K
            while (currentSum >= K && start <= end) {
                currentSum -= prices[start]; // Shrink the window by removing the price at the start
                start++; // Move the start pointer to the right
            }

            // Calculate the maximum length of the valid sequence
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
    public static void main(String[] args) {
//        int[] bet={10, 90, 80, 20, 90, 60, 40, 60, 70, 75};
        int[] bet={40, 10, 70, 10, 90, 50, 90, 70, 60, 90};
        System.out.println(solve(bet,10,100));
    }
}
