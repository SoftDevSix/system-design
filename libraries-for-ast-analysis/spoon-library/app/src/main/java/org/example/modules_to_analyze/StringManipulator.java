package org.example.modules_to_analyze;

public class StringManipulator {

    public static final int MAX_LENGHT = 20;
    private String format;

    public StringManipulator(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String reverse(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public boolean isEqual(String input, String inputToCompare, boolean isExtra) {
        if (isExtra) {
            return false;
        }

        return input.equals(inputToCompare);
    }

    public String toUpperCase(String input) {
        String upper = input.toUpperCase();
        return upper;
    }

    public int countVowels(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }

}
