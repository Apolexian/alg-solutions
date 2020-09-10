/**
Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true

Example 2:

Input: s = "rat", t = "car"
Output: false

Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
*/

class Solution {
    // Time complexity: O(n)
    // Space complexity: O(n)
    fun isAnagram(s: String, t: String): Boolean {

        if(s.length != t.length) {
            return false
        }

        var letterCount = HashMap<Char, Int>()
        for(i in 0 until s.length) {
            if(letterCount.containsKey(s[i])) {
                letterCount.replace(s[i], letterCount.get(s[i])!! + 1)
            } else {
                letterCount.put(s[i], 1)
            }
        }

        for(i in 0 until t.length) {
            if(letterCount.containsKey(t[i])) {
                letterCount.replace(t[i], letterCount.get(t[i])!! -1)
                if(letterCount.get(t[i])!! < 0) {
                    return false
                }
            } else {
                return false
            }
        }
        return true
    }
}

// Better approach

class Solution {
    // Time complexity: O(n)
    // space complexity: O(1)
    fun isAnagram(s: String, t: String): Boolean {
        
       if(s.length != t.length) {
           return false
       }
       
       var counterArray = IntArray(26)
       
       for(i in 0 until s.length) {
           counterArray[s[i] - 'a']++
           counterArray[t[i] - 'a']--
       }
       
       for(count in counterArray) {
           if(count != 0) {
               return false
           }
       }
       return true
    }
}