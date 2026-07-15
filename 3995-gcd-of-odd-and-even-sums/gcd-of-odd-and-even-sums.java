class Solution {
    public int gcdOfOddEvenSums(int n) {
        return helper(n*n,n*(n+1));

        
    }
    public static int helper(int a ,int b){
        if(a==0) return b;
        return helper(b%a,a);
    }
}