package interview;

import java.util.HashMap;
import java.util.Map;

/* Write a Java Program to count the number of words in a string using
HashMap.*/
public class CountNumberOfWords {

    public void countWordsInString(String input) {
        // Split the input string into words using space as a delimiter
        String[] words = input.split("\\s");

        // Create a HashMap to store the count of each word
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Iterate through each word in the array
        for (String word : words) {
            // Convert word to lowercase to make the count case-insensitive
            word = word.toLowerCase();
            // Update the count in the HashMap
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Print the word counts
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

        }
    }
    public void countWordsInStringWithStreams(String input) {
        Map<String, Long> wordCountMap = java.util.Arrays.stream(input.split("\\s"))
                .map(String::toLowerCase)
                .collect(java.util.stream.Collectors.groupingBy(
                        java.util.function.Function.identity(),
                        java.util.stream.Collectors.counting()
                ));
        wordCountMap.forEach((word, count) -> System.out.println(word + ": " + count));
    }


    public static void main(String[] args) {
        String input = "Hello world Hello Java world";// Java 8+ version using streams

        new CountNumberOfWords().countWordsInString(input);
    }
}
