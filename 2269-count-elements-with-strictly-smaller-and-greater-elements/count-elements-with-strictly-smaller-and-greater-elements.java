class Solution {
    public int countElements(int[] nums) {
        int elements=0;
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[0]==nums[i]||nums[nums.length-1]==nums[i]){
                count+=1;
            }
        }
        return elements=nums.length-count;
    }
}