1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        Arrays.sort(nums1);
4        Arrays.sort(nums2);
5        ArrayList<Integer> ans=new ArrayList<>();
6        int n=nums1.length;
7        int m=nums2.length;
8        int i=0,j=0;
9        if(n>m){
10            intersection(nums2,nums1);
11        }
12        while(i<n && j<m){
13            if(nums1[i]>nums2[j]){
14                j++;
15            }else if(nums1[i]<nums2[j]){
16                i++;
17            }else if(nums1[i]==nums2[j] && (ans.isEmpty() || nums1[i]!=ans.get(ans.size()-1))){
18                ans.add(nums1[i]);
19                i++;
20                j++;
21            }else{
22                i++;
23                j++;
24            }
25        }
26        int[] res=new int[ans.size()];
27        for(int k=0;k<res.length;k++){
28            res[k]=ans.get(k);
29        }
30        return res;
31    }
32}