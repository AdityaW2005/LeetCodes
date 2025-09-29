class Solution {
    public boolean isThree(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0) count++;
        }
        return count == 3;

        // Optimized Code

        // int count=2;
        // for(int i=2;i<=(n/2);i++){
        //     if(n%i==0) count++;
        // }
        // return count==3;
    }
}