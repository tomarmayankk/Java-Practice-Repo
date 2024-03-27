package Arrays;
import java.util.HashMap;
import java.util.Map;
//Write a program to convert roman to integer (LEETCODE PROBLEM)

public class A6 {
        public int romanToInt(String s) {
            Map<Character, Integer> m = new HashMap<>();
            
            m.put('I', 1);
            m.put('V', 5);
            m.put('X', 10);
            m.put('L', 50);
            m.put('C', 100);
            m.put('D', 500);
            m.put('M', 1000);
            
            int ans = 0;
            
            for (int i = 0; i < s.length(); i++) {
                if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                    ans -= m.get(s.charAt(i));
                } else {
                    ans += m.get(s.charAt(i));
                }
            }
            
            return ans;
        }
    public static void main(String[] args){
        A6 solution = new A6();

        // Test cases
        String[] testCases = {
            "III",  // 3
            "IV",   // 4
            "IX",   // 9
            "LVIII",// 58
            "MCMXCIV"  // 1994
        };

        for (String testCase : testCases) {
            int result = solution.romanToInt(testCase);
            System.out.println("Roman numeral: " + testCase + " -> Integer: " + result);
        }

    }
}
