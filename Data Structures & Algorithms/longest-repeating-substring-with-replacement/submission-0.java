class Solution {
    public int characterReplacement(String s, int k) {


        int n = s.length(),l=0 , res =0 , maxFreq = 0;

        int count[] = new int[256];

        for(int i=0;i<n;i++){

            int x = (int)(s.charAt(i));

            count[x]++;
            maxFreq = Math.max(maxFreq , count[x]);


            while(i-l-maxFreq+1>k){
                int left = (int)(s.charAt(l));
                count[left]--;
                l++;
            }


            res =Math.max(res,i-l+1);
            

        }

        return res;

        
    }
}
