/*
Problem: Two Sum
Pattern: Arrays & Hashing
*/

/*
Brute Force
Time Complexity: O(n*n)
Space Complexity: O(1)
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}


/*
Optimal Solution
Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(mp.containsKey(diff)){
                return new int[]{i,mp.get(diff)};
            }
            mp.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}
