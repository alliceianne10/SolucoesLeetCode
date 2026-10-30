package PalindromeNumber;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }

        int metadeNum = 0;

        while (x > metadeNum) {
            metadeNum = metadeNum * 10 + x % 10;
            x /= 10;
        }

        return (x == metadeNum || x == metadeNum / 10);
    }
}