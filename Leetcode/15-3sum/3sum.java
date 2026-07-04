class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res=new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
            HashMap<Integer,Integer> h=new HashMap<>();
            for(int j=i+1;j<nums.length;j++){
                int num3=-(nums[i]+nums[j]);
                if(h.containsKey(num3)){
                    List<Integer> ans= Arrays.asList(nums[i],nums[j],num3);
                    Collections.sort(ans);
                    res.add(ans);
                }
                h.put(nums[j],1);
            }
        }
        return new ArrayList<>(res);
    }
}