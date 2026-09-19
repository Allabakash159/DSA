// 414. Third Maximum Number
class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!arr.contains(nums[i])){
            arr.add(nums[i]);
            }
        }
        Collections.sort(arr, Collections.reverseOrder());
        if(arr.size()>=3){
            return arr.get(2);
        }
        return Collections.max(arr);
     }
}
