/**
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

Note:

    You must do this in-place without making a copy of the array.
    Minimize the total number of operations.
*/

class Solution {
    //Time Complexity: O(n) where n is number of elements in input array.
    // Auxiliary Space: O(1)
    fun moveZeroes(nums: IntArray): Unit {
        var countZeros: Int = 0
        for(i in 0 until nums.size) {
            if(nums[i] != 0) {
                nums[countZeros++] = nums[i]
            }
        }
        while(countZeros < nums.size) {
            nums[countZeros++] = 0
        }
    }
}