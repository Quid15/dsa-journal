public class elementSearch {
    public static int search(int arr[], int target) {
        // if(arr.length == 0) return -1;      --doesn't need it as the default return be -1.
        int i = 0;

        while (i < arr.length) {
            if(arr[i] == target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        System.out.println(search(arr1, 3));

        int arr2[] = {1, 2, 3, 4, 5};
        System.out.println(search(arr2, 6));

        int arr3[] = {};
        System.out.println(search(arr3, 10));

        int arr4[] = {7};
        System.out.println(search(arr4, 7));

        int arr5[] = {5, 1, 5, 2, 5};
        System.out.println(search(arr5, 5));

        int arr6[] = {-10, -5, 0, 5, 10};
        System.out.println(search(arr6, -5));

        int arr7[] = {2, 4, 6, 8, 10};
        System.out.println(search(arr7, 10));

        int arr8[] = {9, 8, 0, 7, 6};
        System.out.println(search(arr8, 0));
    }
}
