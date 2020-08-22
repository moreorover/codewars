package kata.kyu6;

public class ExpandedForm {

    public static String expandedForm(int num)
    {
        StringBuilder result = new StringBuilder();
        String numString = Integer.toString(num);
        char[] numArray = numString.toCharArray();

        for (int i = 0; i < numString.length(); i++) {
            if (!String.valueOf(numArray[i]).equals("0")) {
                result.append(numArray[i]).append("0".repeat(numString.length() - (i + 1)));
                if (i < numString.length() - 1 && checkZeros(numString)) {
                    result.append(" + ");
                }
            }
        }
        return result.toString();
    }

    public static boolean checkZeros(String numString) {
        String[] numArray = numString.split("");
        boolean result = false;
        for (int i = 1; i < numArray.length; i++) {
            if (!numArray[i].equals("0")) {
                result = true;
                break;
            }
        }
        return result;
    }
}
