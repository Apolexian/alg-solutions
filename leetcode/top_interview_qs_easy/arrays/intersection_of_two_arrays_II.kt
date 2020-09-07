/**
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]

Note:

    Each element in the result should appear as many times as it shows in both arrays.
    The result can be in any order.

Follow up:

    What if the given array is already sorted? How would you optimize your algorithm?
    What if nums1's size is small compared to nums2's size? Which algorithm is better?
    What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?


*/
class Solution {
    // Time complexity: O(n + m) where n is nums1.size and m is nums2.size
    // Space complexity: O(min(m, n)) where n is nums1.size and m is nums2.size
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        if(nums1.size > nums2.size) {
            return intersect(nums2, nums1)
        }
        var map = HashMap<Int>()
        for(elem in nums1) {
            map.put(elem, map.getOrDefault(num, 0) + 1)
        }
        var intersection = ArrayList<Int>()
        for(elem in nums2) {
            var count = map.getOrDefault(num, 0)
            if(count > 0) {
                intersection.add(num)
                map.put(num, count - 1)
            }
        }
        return intersection.toIntArray()
    }
}


class Solution {
    // Time complexity: O(mLog(m) + nLog(n)) where n is nums1.size and m is nums2.size
    // Space complexity: O(1)
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        nums1.sort()
        nums2.sort()
        var i: Int = 0
        var j: Int = 0
        var intersection = ArrayList<Int>()
        while(i < nums1.size && j < nums2.size) {
            if(nums1[i] == nums2[j]) {
                intersection.add(nums1[i])
                i++
                j++
            } else if(nums1[i] < nums2[j]) {
                i++
            } else {
                j++
            }
        }
        return intersection.toIntArray()
    }
}
