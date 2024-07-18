class Solution {  
    public int strStr(String haystack, String needle) {  
        int i = 0, j = 0;  
        int ans = -1;  
        while (i < haystack.length() && j < needle.length()) {  
            char ch1 = haystack.charAt(i);  
            char ch2 = needle.charAt(j);  
            if (ch1 == ch2) {  
                if (ans == -1) {  
                    ans = i;  
                }  
                i++;  
                j++;  
            } else {  
                i = i - j + 1;  
                j = 0;  
                ans = -1;  
            }  
        }  
        if (j == needle.length()) {  
            return ans;  
        } else {  
            return -1;  
        }  
    }  
}