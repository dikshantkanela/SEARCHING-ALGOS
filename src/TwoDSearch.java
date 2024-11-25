import java.util.Arrays;

public class TwoDSearch {
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3,4},
                {21,23,6},
                {43,65}
        };
        int target = 21;
        int[] res = search(arr,target);
        System.out.println(Arrays.toString(res));
    }

    static int[] search(int[][] arr, int target){
        if(arr.length ==0){
            return new int[]{-1,-1};
        }
        for(int i = 0; i< arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                if(arr[i][j] == target){
                   return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
