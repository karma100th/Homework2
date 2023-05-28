package task5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountS {
    public static void main(String[] args) {
        String sentence = "сссс сааввв ссс бьбьсс";
        int wordCount = 0;
        Pattern pattern = Pattern.compile("\\b\\w*(с\\w*){3,}\\w*\\b");
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find()) {
            wordCount++;
        }
        System.out.println("Количество слов с буквой 'с', встречающейся 3 и более раз: " + wordCount);
    }
}
