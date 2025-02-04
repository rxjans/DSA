public class Longest_substring_no_repeating_char {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 1) {
            return 0;
        }

        int max = 1;
        int count = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            count = 1; // Reset count for each new starting character
            for (int j = i + 1; j < s.length(); j++) {
                boolean foundDuplicate = false;
                for (int k = i; k < j; k++) {
                    if (s.charAt(k) == s.charAt(j)) {
                        foundDuplicate = true;
                        break;
                    }
                }
                if (!foundDuplicate) {
                    count++;
                    max = Math.max(max, count);
                } else {
                    break; // Break the inner loop when a duplicate is found
                }
            }
        }
        return max;
    }
}
