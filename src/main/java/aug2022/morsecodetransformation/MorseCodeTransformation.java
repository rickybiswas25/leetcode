package aug2022.morsecodetransformation;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/unique-morse-code-words/">...</a>
 *
 * Created by Deb
 *
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:
 *
 *     'a' maps to ".-",
 *     'b' maps to "-...",
 *     'c' maps to "-.-.", and so on.
 *
 * For convenience, the full table for the 26 letters of the English alphabet is given below:
 *
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 *
 * Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.
 *
 *     For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-.", ".-", and "-...". We will call such a concatenation the transformation of a word.
 *
 * Return the number of different transformations among all words we have.
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["gin","zen","gig","msg"]
 * Output: 2
 * Explanation: The transformation of each word is:
 * "gin" -> "--...-."
 * "zen" -> "--...-."
 * "gig" -> "--...--."
 * "msg" -> "--...--."
 * There are 2 different transformations: "--...-." and "--...--.".
 *
 * Example 2:
 *
 * Input: words = ["a"]
 * Output: 1
 */
public class MorseCodeTransformation {
    private static final Map<String, String> CONVERTER = Map.ofEntries(
            Map.entry("a", ".-"),
            Map.entry("b", "-..."),
            Map.entry("c", "-.-."),
            Map.entry("d", "-.."),
            Map.entry("e", "."),
            Map.entry("f", "..-."),
            Map.entry("g", "--."),
            Map.entry("h", "...."),
            Map.entry("i", ".."),
            Map.entry("j", ".---"),
            Map.entry("k", "-.-"),
            Map.entry("l", ".-.."),
            Map.entry("m", "--"),
            Map.entry("n", "-."),
            Map.entry("o", "---"),
            Map.entry("p", ".--."),
            Map.entry("q", "--.-"),
            Map.entry("r", ".-."),
            Map.entry("s", "..."),
            Map.entry("t", "-"),
            Map.entry("u", "..-"),
            Map.entry("v", "...-"),
            Map.entry("w", ".--"),
            Map.entry("x", "-..-"),
            Map.entry("y", "-.--"),
            Map.entry("z", "--..")
    );
    public int findNumberOfUniqueMorseCodeWord(String[] words) {
        Set<String> size = new HashSet<>();
        for (String word : words) {
            StringBuilder morseCodeBuilder = new StringBuilder();
            Arrays.stream(word.split("")).filter(Objects::nonNull)
                    .forEach(item -> morseCodeBuilder.append(CONVERTER.get(item)));
            size.add(morseCodeBuilder.toString());
        }

        return size.size();
    }
}
