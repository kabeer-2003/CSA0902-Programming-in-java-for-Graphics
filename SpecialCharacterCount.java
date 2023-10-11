public class SpecialCharacterCount {
    public static void main(String[] args) {
        String statement = "Modi Birthday @ September 17, #&$% is the wishes code for him.";
        int specialCharacterCount = countSpecialCharacters(statement);
        System.out.println("Number of special Characters: " + specialCharacterCount);
    }

    public static int countSpecialCharacters(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                // Check if the character is not a letter, digit, or whitespace
                count++;
            }
        }
        return count;
    }
}
