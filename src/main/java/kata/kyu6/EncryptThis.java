package kata.kyu6;

import java.util.Arrays;

public class EncryptThis {

    public static String encryptThis(String text) {

        if (text.isEmpty() || text.isBlank()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        String[] stringArray = text.split(" ");

        for (String word : stringArray) {
            String[] letterArray = word.split("");

            letterArray[0] = chartToAsciiString(letterArray[0]);

            if (letterArray.length > 2) {
                String tempHolder = letterArray[letterArray.length - 1];

                letterArray[letterArray.length - 1] = letterArray[1];
                letterArray[1] = tempHolder;
            }

            for (String s : letterArray) {
                result.append(s);
            }
            result.append(" ");
        }

        return result.toString().trim();
    }

    public static String chartToAsciiString(String s) {
        char c = s.charAt(0);
        return String.valueOf((int) c);
    }
}
