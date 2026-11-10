class Solution {
    public int lengthOfLongestSubstring(String s) {


        Map<Character,Integer> map = new HashMap<>();
        int n = s.length() ,max =0, count =0 , left =0;
        if(n<=0){
            return 0;
        }
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int prev = map.get(c);
                left = Math.max(prev+1,left);
            }
           
            map.put(c,i);
            int len = i - left+1;
            max = Math.max(max,len);
        }

        return max;
        
    }
}
