class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        List<Integer> list=new ArrayList<>();
        int m=a.length;
        int n=a[0].length;
        int up=0, left=0;
        while(up<m&&left<n){
            for(int x=left;x<n;x++)
             list.add(a[up][x]);
            up++;
            for(int x=up;x<m;x++)
             list.add(a[x][n-1]);
            n--;
            if (up < m) {
                for(int x=n-1;x>=left;x--)
                    list.add(a[m-1][x]);
                m--;
            }
            if (left < n) {
                for(int x=m-1;x>=up;x--)
                    list.add(a[x][left]);
                left++;
            }
        }
        return list;
    }
}