class Solution {  
    public String longestPalindrome(String s) {  
        int n = s.length();  
        int low, high;  
        int palStart = 0;        // Starting index of the longest palindrome found  
        int palLength = 1;       // The length of the longest palindrome found (minimum 1)  

        for (int i = 0; i < n; i++) {  
            // Check for even-length palindromes  
            low = i;              // Left pointer  
            high = i + 1;        // Right pointer  
            while (low >= 0 && high < n && s.charAt(low) == s.charAt(high)) {  
                if (high - low + 1 > palLength) {  
                    palStart = low; // Update start index  
                    palLength = high - low + 1; // Update length  
                }  
                low--;  // Move left pointer to left  
                high++; // Move right pointer to right  
            }  

            // Check for odd-length palindromes  
            low = i;              // Left pointer  
            high = i;            // Right pointer  
            while (low >= 0 && high < n && s.charAt(low) == s.charAt(high)) {  
                if (high - low + 1 > palLength) {  
                    palStart = low; // Update start index  
                    palLength = high - low + 1; // Update length  
                }  
                low--;  // Move left pointer to left  
                high++; // Move right pointer to right  
            }  
        }  

        // To debug, you can print the starting index and length of the longest palindrome found  
        // System.out.println(palStart + "----" + palLength);  

        // Return the longest palindromic substring  
        return s.substring(palStart, palStart + palLength);  
    }  
}