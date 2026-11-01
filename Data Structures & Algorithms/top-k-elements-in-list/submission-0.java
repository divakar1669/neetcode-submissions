class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->( map.get(a) -  map.get
        (b)));
        int n = nums.length;

        for(int i=0;i<n;i++){
            int x = nums[i];
            map.put(x, map.getOrDefault(x,0)+1);
        }   


        for (int x : map.keySet()) {
            pq.add(x);

            if (pq.size() > k) {
                pq.remove();
            }
        }

        // System.out.println(pq);

        List<Integer> list = new ArrayList<>();

        while(!pq.isEmpty()){
            int x = pq.remove();
            list.add(x);
            
        }

        return list.stream().mapToInt(Integer::intValue).toArray();

    }
}
