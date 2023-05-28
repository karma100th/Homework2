package task7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstLastA {
    public static void main(String[] args) {
        String sentence = "опврпво аарорроа лдоа аоллоа";
        Pattern pattern = Pattern.compile("\\b[aA]\\w*[aA]\\b");
        Matcher matcher = pattern.matcher(sentence);
        
        if (matcher.find()) {
            System.out.println("Такие слова присутствуют в заданном предложении");
        } else {
            System.out.println("Таких слов нет");
        }
    }
}
