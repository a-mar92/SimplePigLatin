// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    }

    public static String pigIt(String str) {
        StringBuilder changedWords = new StringBuilder();
        String[] words = str.split(" ");
        for (String word : words) {
            if (word.matches("[a-zA-Z]+")){
            changedWords.append(word.substring(1)+word.charAt(0) +"ay " );
        }else {
                changedWords.append(word).append(" ");
            }
}
        return changedWords.toString().trim();
    }}
