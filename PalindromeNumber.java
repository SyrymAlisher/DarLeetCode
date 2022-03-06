public class PalindromeNumber {
    public static void main(String[] args) {
    }
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int copyOfX = x;
        int reverseNumber = 0;
        while(x>0){
            reverseNumber = x%10 + reverseNumber*10;
            x=x/10;
        }
        return copyOfX==reverseNumber;
    }
}
