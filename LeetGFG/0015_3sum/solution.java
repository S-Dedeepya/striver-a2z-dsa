1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Set<List<Integer>> res=new HashSet<>();
4        for(int i=0;i<nums.length-1;i++){
5            HashMap<Integer,Integer> h=new HashMap<>();
6            for(int j=i+1;j<nums.length;j++){
7                int num3=-(nums[i]+nums[j]);
8                if(h.containsKey(num3)){
9                    List<Integer> ans= Arrays.asList(nums[i],nums[j],num3);
10                    Collections.sort(ans);
11                    res.add(ans);
12                }
13                h.put(nums[j],1);
14            }
15        }
16        return new ArrayList<>(res);
17    }
18}