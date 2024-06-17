class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        // Initialize all numbers to be prime
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Sieve of Eratosthenes algorithm
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                // Mark multiples of i as non-prime
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Count primes
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }
}