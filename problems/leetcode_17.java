import java.util.*;

class leetcode_17 {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;

        String[] phoneMap = {
            "",     "",     "abc",  "def", "ghi",
            "jkl",  "mno",  "pqrs", "tuv", "wxyz"
        };

        backtrack(result, phoneMap, digits, 0, new StringBuilder());
        return result;
    }

    private void backtrack(List<String> result, String[] phoneMap, String digits, int index, StringBuilder current) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = phoneMap[digits.charAt(index) - '0'];
        for (char ch : letters.toCharArray()) {
            current.append(ch);
            backtrack(result, phoneMap, digits, index + 1, current);
            current.deleteCharAt(current.length() - 1); // backtrack
        }
    }
}
