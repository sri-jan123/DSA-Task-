class Solution {
    public int removeDuplicates(int[] nums) {

        // we initialize a res variable to 1 and begin our iteration through   the       loop from n=1 as we the first element will always be unique.

        // now we check that if the current element of the i is equal to the previous element of i

        // if false then we initialize our current element to next elemnt of res and increase it by one.

        // at last we return the nums array

        int res=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[res-1]){
                nums[res]=nums[i];
                res++;
            }
        }
        return res;
    }
}