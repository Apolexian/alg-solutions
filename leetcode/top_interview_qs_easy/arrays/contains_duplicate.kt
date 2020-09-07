/**
Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:

Input: [1,2,3,1]
Output: true

Example 2:

Input: [1,2,3,4]
Output: false

Example 3:

Input: [1,1,1,3,3,4,3,2,4,2]
Output: true

*/

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        var valueSet = HashSet<Int>()
        for(i in 0 until nums.size) {
            if(!valueSet.contains(nums[i])) {
                valueSet.add(nums[i])
            }else{
                return true
            }
        }
        return false
    }
}