class Solution {
    public int missingNumber(int[] nums) {
        
        // find the sum of all the numbers present in the range using formula n*(n+1)/2
        //now calculate the sum of all the elements present the array
        //now calculate the difference and return the difference

        int n=nums.length;
        int sum=0;
        int allsum=(n*(n+1))/2;

        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }

        return allsum-sum;
    }
}