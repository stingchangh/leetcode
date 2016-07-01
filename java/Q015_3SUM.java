/*
* Author:   Sting Chang
* Question: https://leetcode.com/problems/3sum/
* 
**/

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        if(nums == null || nums.length==0){
            return lists;
        }
        
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        Set<List<Integer>> set = new HashSet<>();
        int len = nums.length;
        for(int i = 0; i< len-2; i++){
            int target = nums[i]*-1;
            int j = i+1, k = len-1;
            while(j<k){
                int sum = nums[j]+nums[k];
                if( sum == target){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j++]);
                    list.add(nums[k--]);
                    set.add(list);
                    
                } else if(sum<target){
                    j++;
                } else {
                    k--;
                }
            }
        }
        // lists = new ArrayList<>(set);
        for(List<Integer> list: set){
            lists.add(list);
        }
        return lists;
    }
}