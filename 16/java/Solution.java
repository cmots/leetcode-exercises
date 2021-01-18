//与15类似，双指针
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=nums[0] + nums[1] + nums[2];
        if(nums.length == 3) return nums[0] + nums[1] + nums[2];
        
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++){
            int l=i+1, r=nums.length-1;
            while(l < r){
                int a = (nums[i] + nums[l] + nums[r]) - target;
                int b = sum - target;
                if( ((a<0)?-a:a) <= ((b<0)?-b:b)) sum = nums[i] + nums[l] + nums[r];
                if((nums[i] + nums[l] + nums[r]) < target) l++;
                else if((nums[i] + nums[l] + nums[r]) > target) r--;
                else return nums[i] + nums[l] + nums[r];
            }
        }
        return sum;
    }
}
