package task9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWord {
    public static void main(String[] args) {
        String sentence = "искомое слово - вот";
        Pattern pattern = Pattern.compile("\\bвот\\b");
        Matcher matcher = pattern.matcher(sentence);
        if (matcher.find()) {
            System.out.println("Индекс первого символа искомого в строке слова: " + matcher.start());
        } else {
            System.out.println("Такого слова в строке нет.");
        }
    }
}
