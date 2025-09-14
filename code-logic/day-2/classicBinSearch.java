public class classicBinSearch {
    public static int binSearch(int arr[], int target){
        int low = 0, high = arr.length-1;

        while(low <= high){
        
            int mid = low + (high - low)/2;

            if (arr[mid] == target) {
            return mid;
            } else if (target < mid) {
            low = mid - 1;
            } else if (target > mid) {
            high = mid + 1;
            }
        }   
        return -1;
    }
    public static void main(String[] args) {
       int arr1[] = {1,2,3,3,4,5};
       System.out.println(binSearch(arr1, 3));
    }
}
