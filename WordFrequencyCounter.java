package com.company;

import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        String[] words = sentence.split("\\s+");
        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase(); // Convert to lowercase for case-insensitive comparison
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word frequency in the sentence:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

