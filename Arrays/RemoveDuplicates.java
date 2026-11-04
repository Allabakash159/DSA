// 26. Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] nums) {
        int l,r;
        l=0;
        r=0;
        while(r<nums.length){
            if(nums[l]==nums[r]){
                r++;
                continue;
            }
            l++;
            nums[l]=nums[r];
            r++;
        }
        return l+1;
    }
}
