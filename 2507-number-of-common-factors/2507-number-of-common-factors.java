class Solution {
     public static int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

     public static int countFactors(int n) {
        int count =0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
     }
      public int commonFactors(int a, int b) {
        int gcdvalue=gcd(a,b);
        return countFactors(gcdvalue);
      }
}