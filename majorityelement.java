class Solution {
    public int majorityElement(int[] nums) {
      /* this solution has two approaches,one is using sorting O(n log n) and other using moore voting algorithm O(n)  */

      // using sorting
         /* sort the array and return the nums[nums.length/2], this will alawys return the majority element as the majority elements oocurs more than n/2 times */


         //using moore voting algorithm

         /* take two variables count and current and initialize them to zero. 
         Iterate through the array and check if count==0.If zero initialize the array element to current
         Now check if current element in the array equals the current.If yes increment the count by one 
         If no,decrement the count by 1 
         return the current element.This will be majority element */

        // Arrays.sort(nums);
        // return nums[nums.length/2];

        int count=0;
        int current=0;

        for(int i=0;i<nums.length;i++){
            if (count==0){
                current=nums[i];
            }
            if(current==nums[i]){
                count++;
            }
            if(current!=nums[i]){
                count--;
            }
        }
        return current;

    }
}
