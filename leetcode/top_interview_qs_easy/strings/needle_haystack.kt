/**
mplement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2

Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

 

Constraints:

    haystack and needle consist only of lowercase English characters.
*/

class Solution {
    fun strStr(haystack: String, needle: String): Int {
        
        var index = -1
        var i = 0
        var j = needle.length - 1

        while(j < haystack.length) {
            if(haystack.substring(i, j + 1) == needle) {
                return i
            }
            j++
            i++
        }

        return -1
    }
}