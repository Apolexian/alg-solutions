/**
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true

Example 2:

Input: "race a car"
Output: false

 

Constraints:

    s consists only of printable ASCII characters.
*/

class Solution {
    fun isPalindrome(s: String): Boolean {
        var cleanString = s.filter{ it.isLetterOrDigit() }
        cleanString = cleanString.toLowerCase()
        for(i in 0 until cleanString.length / 2) {
            if(cleanString[i] != cleanString[cleanString.length - 1 - i]) {
                return false
            }
        }
        return true
    }
}