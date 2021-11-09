package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	/*Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

    A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

    Example 1:

    Input: digits = "23"
    Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    Example 2:

    Input: digits = ""
    Output: []
    Example 3:

    Input: digits = "2"
    Output: ["a","b","c"]


    Constraints:

    0 <= digits.length <= 4
    digits[i] is a digit in the range ['2', '9'].*/
        String digits = "7698";
        Solution solution = new Solution();
        List <String> combinations = solution.letterCombinations(digits);

        //System.out.println(digits.substring(1));
        for (String c : combinations) {
            System.out.println(c);
        }
    }
    /*static {
        Map<Integer, String> phone = new HashMap();
        phone.put(2, "abc");
        phone.put(3, "def");
        phone.put(4, "ghi");
        phone.put(5, "jkl");
        phone.put(6, "mno");
        phone.put(7, "pqrs");
        phone.put(8, "tuv");
        phone.put(9, "wxyz");
    }*/
    /*public static List<String> letterCombinations(String digits) {



        List<String> result;// = new ArrayList<>();
        result = new ArrayList<>();
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


    }*/
}
