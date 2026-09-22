// 27. Remove Element
class Solution {
    public int removeElement(int[] nums, int val) {
        int w=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]!=val){
                if(r!=w){
                    int temp=nums[r];
                    nums[r]=nums[w];
                    nums[w]=temp;
                }
                w++;
            }
        }
        return w;
    }
}
