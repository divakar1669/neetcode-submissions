class Solution {

    void twoSum(int k,int target,int []nums,List<List<Integer>> ans){

        int n =nums.length ,  i=k+1,j=n-1;

        while(i<j){
            if(nums[i]+nums[j] == target){
                ans.add(new ArrayList<>(List.of(nums[k],nums[i],nums[j])));

                while(i+1<n && nums[i]==nums[i+1]){
                    i++;
                }

                while(j>0 && nums[j] == nums[j-1]){
                    j--;
                }
                i++;
                j--;
            }
            else if(nums[i]+nums[j] < target){
                i++;
            }
            else{
                j--;
            }
        }
        return ;
    }
    public List<List<Integer>> threeSum(int[] nums) {

        int n =nums.length , target =0;
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();


        for(int i=0;i<n;i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int sum = target - nums[i];
            twoSum(i,sum,nums,list);
        }

        return list;

        
        
    }
}
