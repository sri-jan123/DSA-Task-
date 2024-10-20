class Solution {
    //run a for loop and count the ones 
    //if any 0 occurs make the counter 0
    //store maximum count in a variable and return it
    
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;

        if(nums.length==1 && nums[0]==0){
            return 0;
        }
       for(int i=0;i<nums.length;i++){
        if(nums[i]==1){
           count++;
        }
        else{
            count=0;
        }
        if(count>max){
            max=count;
        }
       } 
       return max; 
    }
}