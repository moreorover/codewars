package kata.kyu6;

public class StringSplit {
    public static String[] solution(String s) {
        int length = s.split("").length;
        int blockSize = 2;
        String[] emptyResult = buildEmptyResult(length, s, blockSize);

        if (emptyResult.length == 0) {
            return emptyResult;
        }

        int counter = 0;

        for (int i = 0; i < emptyResult.length; i++) {
            try {
                emptyResult[i] = s.split("")[counter] + s.split("")[counter + 1];
                counter = counter + blockSize;
            } catch (IndexOutOfBoundsException e) {
                emptyResult[i] = s.split("")[counter] + "_";
            }
        }
        return emptyResult;
    }

    public static String[] buildEmptyResult(int length, String s, int blockSize) {
        if (s.isBlank() || s.isEmpty()) {
            return new String[0];
        }
        if (length % blockSize == 0) {
            return new String[length / blockSize];
        }
        else {
            return new String[length / blockSize + 1];
        }
    }
}
