// Using Recursion

class Solution {
    static int countUniquePath(int m,int n,int i,int j){
        if(i==(n-1) && j==(m-1))return 1;
        if(i>=n || j>=m) return 0;
        else return countUniquePath(m,n,i+1,j) + countUniquePath(m,n,i,j+1);
    }
    public int uniquePaths(int m, int n) {
        int i=0,j=0;
        return countUniquePath(m,n,i,j);
    }
}


// Using DP (Top Down Approach)

class Solution {
    static int countUniquePath(int m,int n){
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                // base case
                if(i==0 || j==0)
                    dp[i][j]= 1;
                else
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
    public int uniquePaths(int m, int n) {
        return countUniquePath(m,n);
    }
}


// Using Combinomatrics

class Solution {
    public int uniquePaths(int m, int n) {
        int N=m+n-2;
        int r=m-1;
        
        double res=1;
        
        for(int i=1;i<=r;i++)
        {
            res=res*(N-r+i)/i;
        }
        return (int)res;
    }
}
