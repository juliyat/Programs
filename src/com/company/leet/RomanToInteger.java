package com.company.leet;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String... args) {
        System.out.println(romanToInt("MMDCCXXIV"));

    }

    public static int romanToInt(String s) {
        int temp = 0;
        int sum = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i = s.length() - 1; i >= 0; i--) {
            int val = map.get(s.charAt(i));
            if (val >= temp) {
                sum += val;
            } else {
                sum -= val;
            }
            temp = val;
        }

        return sum;
    }
}
