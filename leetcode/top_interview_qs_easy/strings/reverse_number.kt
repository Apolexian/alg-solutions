/**
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321

Example 2:

Input: -123
Output: -321

Example 3:

Input: 120
Output: 21

Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
*/

class Solution {
    fun reverse(x: Int): Int {
        var x = x
        var isNegative = x < 0
        if(isNegative) {
            x = -x;
        }
        var newNumber: Long = 0
        
        while(x > 0){
            var lastDigitOfX = x % 10;
            newNumber = (newNumber * 10) + lastDigitOfX;
            x = x / 10;
        }
        
        if(newNumber > Int.MAX_VALUE){
            return 0;
        }
        
        if(isNegative){
            newNumber = -newNumber;
        }
        
        return newNumber.toInt();
    }
}
