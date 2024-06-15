 class Solution {
        public  int help(int[] arr, int k) {
     int l = 0;
    int r = 0;
    int cnt = 0;

    HashMap<Integer, Integer> mpp = new HashMap<>();
    while (r < arr.length) {
        mpp.put(arr[r],mpp.getOrDefault(arr[r],0)+1);
        while(mpp.size()>k){
            mpp.put(arr[l],mpp.get(arr[l])-1);
            if(mpp.get(arr[l])==0){
                mpp.remove(arr[l]);
            }
            l++;}
            cnt=cnt+r-l+1;
            r++;
        }
       return cnt;      
}
     public int subarraysWithKDistinct(int[] arr, int k) {
          return help(arr,k)-help(arr,k-1);
    }
 }

// better than up

//  class Solution {
//      public int subarraysWithKDistinct(int[] nums, int K) {
//         int[] numFreq = new int[nums.length+1];
//         int distinct = 0, start = 0, minEnd = 0, total = 0;
//         while (distinct == K || minEnd < nums.length) {
//             while (distinct < K && minEnd < nums.length) 
// 			    if (numFreq[nums[minEnd++]]++ == 0) 
//                 distinct++;
//             int maxEnd = minEnd;
//             while (maxEnd < nums.length && numFreq[nums[maxEnd]] > 0)
// 			    maxEnd++;
//             while (distinct == K) {
//                 if (numFreq[nums[start++]]-- == 1)
//                 distinct--;
//                 total += (maxEnd - minEnd + 1);
//             }
//         }
//         return total;
//     }
//  }