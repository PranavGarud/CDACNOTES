package temp;

import java.util.HashMap;

public class AnagramChecker {

    private static HashMap<Character, Integer> countCharacters(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        return charCount;
    }

    
    public static boolean areAnagrams(String str1, String str2) {
        
        str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> count1 = countCharacters(str1);
        HashMap<Character, Integer> count2 = countCharacters(str2);

        return count1.equals(count2);
    }

    public static void main(String[] args) {
        String str1 = "Fried";
        String str2 = "fired";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
