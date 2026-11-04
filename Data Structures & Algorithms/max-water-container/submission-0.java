class Solution {
    public int maxArea(int[] height) {

        int n = height.length, i=0,j=n-1 , max =0;

        while(i<j){
            int h = Math.min(height[i],height[j]) , w = j-i,
                area = h*w;
            max =Math.max(max,area);

            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }


        }

        return max;
        
    }
}
