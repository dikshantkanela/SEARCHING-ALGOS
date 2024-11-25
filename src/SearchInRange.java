import java.util.Arrays;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,32,12,43,21,-12,-1};
        int start = 3;
        int end = 6;
        int target = 21;
        int ans = search(arr,target,start,end);
        System.out.println(ans);

    }


    static int search(int[] arr, int target, int start, int end){
        if(arr.length == 0 ){
            return -1; // element not found
        }

        for(int i = start ;i<=end;i++){
            if(target == arr[i]){
                return i; // element found at index i
            }
        }
        return -1; // element not found


    }

}
