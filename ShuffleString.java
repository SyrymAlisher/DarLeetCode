public class ShuffleString {
    public static void main(String[] args) {
        
    }
    public String restoreString(String s, int[] indices) {
        int len = indices.length;
        char[] arr = new char[len];
        for (int i = 0; i < len; ++i) {
            int idx = indices[i];
            arr[idx] = s.charAt(i);
        }
        return String.valueOf(arr);
    }
}
