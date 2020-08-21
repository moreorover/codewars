package kata.kyu6;

public class CamelCase {
    public static String camelCase(String input) {
        StringBuilder result = new StringBuilder();

        char[] inputChars = input.toCharArray();
        for (char letter : inputChars) {
            if (Character.isUpperCase(letter)) {
                result.append(" ").append(letter);
            } else {
                result.append(letter);
            }
        }
        return result.toString().trim();
    }
}
