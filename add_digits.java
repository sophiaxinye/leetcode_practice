/*
 Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it. 
 */

public class Solution {
    public int addDigits(int num) {
        int sum = 0;
        int data = 0;
        if (num <= 9) {
            sum = num;
        } else {
            data = num%9;
             if (data == 0 ) {
                 sum = 9;
             } else {
                 sum = data;
             }
        }
        
        return sum;
    }
}

// Runtime: 304 ms
