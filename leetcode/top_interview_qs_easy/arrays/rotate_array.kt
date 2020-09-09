/**
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
*/

class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        var arrayLength = matrix.size
        
        // transpose matrix
        for(i in 0 until arrayLength) {
            for(j in i until arrayLength) {
                var temp = matrix[i][j]
                matrix[i][j] = matrix[j][i]
                matrix[j][i] = temp
            }
        }
        
        // flip matrix horizontally
        for(i in 0 until arrayLength) {
            for(j in 0 until arrayLength/2) {
                var temp = matrix[i][j]
                matrix[i][j] = matrix[i][arrayLength - 1 - j]
                matrix[i][arrayLength - 1 - j] = temp
            }
        }
    }
}