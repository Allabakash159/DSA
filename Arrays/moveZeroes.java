// 283. Move Zeroes
class Solution {
    public void moveZeroes(int[] nums) {
        int r=0;
        int w=0;
        while(r<nums.length){
            if(nums[r]==0){
                r++;
                continue;
            }
            int temp=nums[r];
            nums[r]=nums[w];
            nums[w]=temp;
            w++;
            r++;
        }
    }
}
