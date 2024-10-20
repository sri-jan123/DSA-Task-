class Solution {
    public void moveZeroes(int[] nums) {

        //use a variable res to move the non zero elements to the front and by then from res to last elements make all the elements 0
        
        int res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[res]=nums[i];
                res++;
            }
        }
        for(int i=res;i<nums.length;i++){
            nums[i]=0;
        }
        
    }
}