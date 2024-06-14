class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxFreq=0;int value=Integer.MAX_VALUE;
        for (int num : nums) {
            if (num % 2 == 0) {
                hm.put(num, hm.getOrDefault(num, 0) + 1);
                int currentFreq = hm.get(num);

                if(currentFreq> maxFreq|| currentFreq==maxFreq && num<value){
                    value=num;
                    maxFreq=currentFreq;
                }

            }
        }
        return maxFreq==0?-1:value;
    }
}