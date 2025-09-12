class arrayMax {
    public static Integer Max(int arr[]) {
        if (arr.length == 0 ) return null;

        int max = arr[0];
        int i = 1;

        while (i < arr.length) { 
            if(arr[i] >= max) {
                max = arr[i];
            }
            i++;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr1[] = {7};
        System.out.print(Max(arr1));
    }
}