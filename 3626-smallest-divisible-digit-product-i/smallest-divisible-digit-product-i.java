class Solution {
    public int smallestNumber(int n, int t) {
        int ans=0;
        while(true){
            int val=product(n);
            if(val%t==0){
                ans=n;
                break;
            }
            n++;
        }
        return ans;

        
    }
    public int product(int n){
        int pro=1;
        while(n>0){
            int digit=n%10;
            pro*=digit;
            n=n/10;
        }
        return pro;
    }
}