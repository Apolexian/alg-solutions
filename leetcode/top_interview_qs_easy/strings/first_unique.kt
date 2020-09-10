/**
Given a string, find the first non-repeating character in it and return its index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode"
return 2.

 

Note: You may assume the string contains only lowercase English letters.
*/

class Solution {
    fun firstUniqChar(s: String): Int {
        var map = HashMap<Char, Int>()
        for(i in 0 until s.length) {
            if(map.containsKey(s[i])) {
                map.replace(s[i], map.get(s[i])!! + 1)
            } else {
                map.put(s[i], 1)
            }
        }
        for(i in 0 until s.length) {
            if(map.get(s[i]) == 1) {
                return i
            }
        }
        return -1
    }
}