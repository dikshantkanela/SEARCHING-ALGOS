import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
       int[] arr = {1,2,32,12,43,21,-12,-1};
       int target = 32;
       int ans = search(arr,target);
       System.out.println(ans);
       int[] ans2 = search2(arr,target);
       System.out.println(Arrays.toString(ans2));
    }
    static int[] search2(int[] arr, int target){

        if(arr.length == 0 ){
            return new int[]{-1,-1};
        }

        for(int i =0 ;i<arr.length;i++){
            if(target == arr[i]){
              return new int[]{i,target};
            }
        }
        return new int[]{-1,-1};


    }

    static int search(int[] arr, int target){
        if(arr.length == 0 ){
            return -1; // element not found
        }

        for(int i =0 ;i<arr.length;i++){
            if(target == arr[i]){
                return i; // element found at index i
            }
        }
        return -1; // element not found


    }
}