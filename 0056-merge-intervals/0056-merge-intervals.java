class Solution {
    public int[][] merge(int[][] arr) {
        int n = arr.length; // size of the array
        //sort the given intervals:
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        int[][] ans = new int[n][2];
        int index = 0;

        for (int i = 0; i < n; i++) {
            // if the current interval does not
            // lie in the last interval:
            if (index == 0 || arr[i][0] > ans[index - 1][1]) {
                ans[index][0] = arr[i][0];
                ans[index][1] = arr[i][1];
                index++;
            }
            // if the current interval
            // lies in the last interval:
            else {
                ans[index - 1][1] = Math.max(ans[index - 1][1], arr[i][1]);
            }
        }

        // Resize the array to remove unused slots (if any)
        return Arrays.copyOf(ans, index);
    }
}