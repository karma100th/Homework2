package task8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberCard {
    public static void main(String[] args) {
        String sentence = "Номер кары : 1234-5678-9012-3456";
        Pattern pattern = Pattern.compile("\\b\\d{4}-\\d{4}-\\d{4}-\\d{4}\\b");
        Matcher matcher = pattern.matcher(sentence);
        if (matcher.find()) {
            System.out.println("Номер карты: " + matcher.group());
        } else {
            System.out.println("Номер кредитной карты не найден.");
        }
    }
}
