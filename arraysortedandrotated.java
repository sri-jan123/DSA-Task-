class Solution {
    public boolean check(int[] nums) {

        // if we rotate an array by k positions, and k becomes greater than n, then to normalise k we use k=k%n. So we have used the same technique to solve this.

        // in a sorted array that has been rotated there will be atmost 1 point where the elemnt is greater than its next element.So we initialize a counter and check that if any such condition exists we return true else false....that is if count gives more than 1 we return false else true; 
        
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }
}