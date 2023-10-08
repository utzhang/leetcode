package org.utz.offer;

import java.util.HashMap;
import java.util.Map;

public class Pb034IsAlienSorted {
    private Map<Character, Integer> charOrder = new HashMap<>();

    public boolean isAlienSorted(String[] words, String order) {
        if (words.length <= 1) {
            return true;
        }

        for (int i = 0; i < order.length(); i++) {
            charOrder.put(order.charAt(i), i);
        }

        for (int i = 0; i < words.length - 1; i++) {
            if (!twoWordsSorted(words[i], words[i + 1])) {
                return false;
            }
        }
        return true;
    }

    private boolean twoWordsSorted(String word1, String word2) {
        int index = 0;
        while (index < word1.length() && index < word2.length()) {
            if (charOrder.get(word1.charAt(index)) > charOrder.get(word2.charAt(index))) {
                return false;
            }
            if (charOrder.get(word1.charAt(index)) < charOrder.get(word2.charAt(index))) {
                return true;
            }
            index++;
        }
        if (index < word1.length()) {
            return false;
        }
        return true;
    }
}
