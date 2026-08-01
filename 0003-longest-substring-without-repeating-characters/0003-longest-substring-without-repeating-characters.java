class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLen = 0;

        HashSet<Character> visited = new HashSet<>();

        for(int right = 0; right < s.length(); right++) {
            while(visited.contains(s.charAt(right))) {
                visited.remove(s.charAt(left));
                left++;
            }

            visited.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
} 