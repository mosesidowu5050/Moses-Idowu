import java.util.HashSet;
import java.util.Set;

class StringSolution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> charSet = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for(int right = 0; right < n; right++){
            char currentChar = s.charAt(right);
            while (charSet.contains(currentChar)){
                charSet.remove(s.charAt(left));
                    left++;
            }
            charSet.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
  
        }
        return maxLength;
    }
            
}

