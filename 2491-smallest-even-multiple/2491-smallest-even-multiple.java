class Solution {
    public int smallestEvenMultiple(int n) {
int p=2*n;
        if(n%2==0){
            return n;
        }
        
        else {
            return p;
        }
    }
}