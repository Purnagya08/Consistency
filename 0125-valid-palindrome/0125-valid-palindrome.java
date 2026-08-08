class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) {
            return true;
        }

        int start = 0;
        int end = s.length() - 1;

        while(start <= end) {
            char at_Start = s.charAt(start);
            char at_End = s.charAt(end);

            if(!Character.isLetterOrDigit(at_Start)) {
                start++;
            } 
            else if(!Character.isLetterOrDigit(at_End)) {
                end--;
            } 
            else {
                if(Character.toLowerCase(at_Start) != Character.toLowerCase(at_End)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}