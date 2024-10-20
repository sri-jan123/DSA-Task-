class Solution {

    //sort the arrays
    //iterate throught the loop by skipping one element that is i+=2
    // if the element is the last elemnt,then return it
    //else check that whether the element is equal to its next element or not
    //return the unique element
    
    public int singleNumber(int[] nums) {
        Arrays.sort(nums); 
        for (int i = 0; i < nums.length; i += 2) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return -1; 
    }

    }
