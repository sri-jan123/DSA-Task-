class Solution {
    //left rotation
       /* create a method that reverses the given array.
       firstly rotate the first k-1 elements
       then rotate k to n-1 elements
       lastly rotate the whole array
       this rotates the array to left by k positions */


     //right rotation
        /* create a helper function that reverses the array
        now firstly rotate the whole array
        then rotate the first k-1 elements
        then rotate the remaining elements from k to n-1
        this rotates the array to right by k positions */  
        
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        helper(nums,0,nums.length-1);
        helper(nums,0,k-1);
        helper(nums,k,nums.length-1);
    }

    void helper(int nums[],int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        }
    }