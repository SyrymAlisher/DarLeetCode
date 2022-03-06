public class SumOfAllOdd {
    public static void main(String[] args) {

    }
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int size = arr.length;

        for(int i = 0; i < size; i++) {
            int count = 0;
            for(int j = i ; j < size; j++){
                count += arr[j];
                if((j+i)%2  == 0){
                    sum += count;
                }
            }
        }
        return sum;
    }
}
