public class CheckTwoStrings {
    public static void main(String[] args) {

    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str = String.join("", word1);
        String str2 = String.join("", word2);
        return str.equals(str2);
    }
}

