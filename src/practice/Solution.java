package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    static Map<Integer, String> phone = new HashMap<>();
    static {
        phone.put(2, "abc");
        phone.put(3, "def");
        phone.put(4, "ghi");
        phone.put(5, "jkl");
        phone.put(6, "mno");
        phone.put(7, "pqrs");
        phone.put(8, "tuv");
        phone.put(9, "wxyz");
    }

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits.length() == 1) {
            int digit = Character.getNumericValue(digits.charAt(0));

            for (int i = 0; i < phone.get(digit).length(); i++) {
                result.add("" + phone.get(digit).charAt(i));
            }
            return result;
        } else if (digits.length() == 0) {
            return result;
        } else {
            int digit = Character.getNumericValue(digits.charAt(0));
            List<String> comb = letterCombinations(digits.substring(1));
            for (int i = 0; i < phone.get(digit).length(); i++) { // letters for digit
                for (int j = 0; j < comb.size(); j++) { // elements of the list from the previous level
                    result.add(phone.get(digit).charAt(i) + comb.get(j));
                }
            }

        }
        return result;


    }
}
