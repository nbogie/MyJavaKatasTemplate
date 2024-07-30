package org.neill.katas.vowelcount;

import java.util.ArrayList;
import java.util.List;

//from https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/java
public class MainVowelCount {
    private MainVowelCount() {

    }

    public static int getCount(String word) {
        ArrayList<Character> vowels = new ArrayList<>(List.of('a', 'e', 'i', 'o', 'u'));
        int total = 0;
        for (Character ch : word.toCharArray()) {
            if (vowels.contains(Character.toLowerCase(ch))) {
                total++;
            }
        }
        return total;
    }
}
