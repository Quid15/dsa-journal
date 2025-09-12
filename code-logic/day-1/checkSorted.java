public class checkSorted {
    public static Boolean ifSorted(int arr[]) {
        if(arr.length == 0) return null;

        //using while loop

       int i = 0;
      while(i < arr.length-1){
          if(arr[i] >= arr[i+1]) return false;
           i++;
      }
      return true;

        // using for loop

        // for (int i = 0; i < arr.length-1;) {
        //     if (arr[i] <= arr[i+1]) {
        //         i++;
        //     }else {
        //         return false;
        //     }
        // return true;
        // }
    }
    public static void main(String[] args) {
        int arr1[] = {1,5,8,9,2};
        System.out.println(ifSorted(arr1));
    }
}
