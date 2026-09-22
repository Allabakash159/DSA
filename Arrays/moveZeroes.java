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


// one more approach is to use a copy of array
// Best approach is the below one
/*
class Solution {
    public void moveZeroes(int[] nums) {
        int w=0;
        for (int r=0;r<nums.length;r++){
           if(nums[r]!=0){
            if(r!=w){
            int temp=nums[r];
            nums[r]=nums[w];
            nums[w]=temp;
            w++;
            }
           }
        }
    }
}
*/


// In this approach I have just used one variable of w and when r,w at same non zero element without extra writing we are just moving forward, we are simply avoiding extra writes 
