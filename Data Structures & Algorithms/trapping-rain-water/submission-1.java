class Solution {
    public int trap(int[] height) {

        int n = height.length;
        int left [] = new int [n];
        int right [] = new int [n];

        int lmax = height[0] , rmax = height[n-1];
        for(int i=0;i<n;i++){
            lmax=Math.max(lmax,height[i]);
            left[i] = lmax;
        }

        for(int i=n-1;i>=0;i--){
            rmax=Math.max(rmax,height[i]);
            right[i] = rmax;
        }

        int max =0;
        for(int i=0;i<n;i++){
            int water = Math.min(right[i], left[i]) - height[i];
            max+=water;
        }

        return max;


        
    }
}
