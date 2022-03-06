public class IntegersToSumUpZero {
    public static void main(String[] args) {

    }
    public int[] sumZero(int n) {
        int sum=0;
        int [] arr = new int [n];
        for(int i=0; i<n-1; i++){
            arr[i]=i+1;
            sum=sum+arr[i];
        }
        arr[n-1]=-sum;
        return arr;
    }
}
