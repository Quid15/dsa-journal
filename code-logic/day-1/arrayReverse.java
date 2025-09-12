import java.util.Arrays;

public class arrayReverse {
    public static void reverse(int arr[]) {
        int i = 0, j = arr.length-1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        reverse(arr1);
        System.out.println(Arrays.toString(arr1));
        // for (int num : arr1) {
        //     System.out.print(num + " ");
        // }
    }
}
