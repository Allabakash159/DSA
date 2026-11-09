// 268. Missing Number


class Solution {
    public int missingNumber(int[] nums) {
        int val=0;
            for(int i=0;i<nums.length;i++){
                val=val+nums[i];
            }
        int l=nums.length;
        return (l*(l+1)>>1)-val;
    }
}
