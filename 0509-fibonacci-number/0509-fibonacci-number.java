class Solution {
    public int fib(int n) {
        if (n == 1||n==0){
            return n;
        }
        int pre = 0;
        int cur = 1;
        for(int i =2 ; i<=n; i++){
            int next = pre + cur;
            pre = cur;
            cur = next;
        }
        return cur;
        
    }
}



        