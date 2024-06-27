class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=nums[i]*nums[i];
   }
      Arrays.sort(a);
      return a;
    }
}