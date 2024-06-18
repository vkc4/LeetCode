class Solution {
    public int maxSubArray(int[] arr) {
         int n=arr.length;
      int maxi = Integer.MIN_VALUE; // maximum sum
        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;

        return maxi;
    //      int maxSum = nums[0];
    // int currentSum = nums[0];

    // for (int i = 1; i < nums.length; i++) {
    //     currentSum = Math.max(nums[i], currentSum + nums[i]);
    //     maxSum = Math.max(maxSum, currentSum);
    // }

    // return maxSum;
        
    }
}