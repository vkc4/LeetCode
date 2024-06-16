class Solution {
    public void nextPermutation(int[] nums) {
         int ind =-1,n=nums.length;
        for(int i = n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            int j = nums.length-1;
            for(int i=0;i<nums.length/2;i++){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                j--;
            }
        }
        else{
            for(int i=n-1;i>=ind;i--){
                if(nums[i]>nums[ind]){
                    int t= nums[i];
                    nums[i]=nums[ind];
                    nums[ind]=t;
                    break;
                }
            }
            Arrays.sort(nums,ind+1,n);
        }
    }
}