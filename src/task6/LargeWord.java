package task6;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class LargeWord {
        public static void main(String[] args) {
            String sentence = "Найди максимально длинное слово";
            Pattern pattern = Pattern.compile("\\b[A-Za-zА-Яа-я]+\\b");
            Matcher matcher = pattern.matcher(sentence);
            String longestWord = "";
            while (matcher.find()) {
                String word = matcher.group();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            System.out.println("Самое длинное слово в данном предложении: " + longestWord);
        }
    }
