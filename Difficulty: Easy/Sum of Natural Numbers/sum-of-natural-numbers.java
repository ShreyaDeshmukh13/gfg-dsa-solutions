// User function Template for Java

class Solution {
    static int sumOfNaturals(int n) {
        // code here
        if (n == 0)
        return 0 ;
        else if (n==1)
        return 1 ;
        
        int sum = 0 ;
        for(int i = 0 ; i<=n ;i++)
        {
            sum = sum + i ;
        }
    
        return sum;
    }
};