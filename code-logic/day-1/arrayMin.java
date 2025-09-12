class arrayMin {
    public static Integer min(int arr[]){
        if (arr.length == 0) return null;

        int minimum = arr[0];
        int i = 1;

        while (i < arr.length) {
            if (minimum <= arr[i]) {
                minimum = arr[i];
            }
            i++;
        }

        return minimum;
    }
    public static void main(String[] args) {
        int arr1[] = {3,1,9,7};
        System.out.println(min(arr1));
    }
}
