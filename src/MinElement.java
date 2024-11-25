public class MinElement {
    public static void main(String[] args) {
        int[] arr = {21,22,11,2,3,24,50,32,-21};
        int res = minimum(arr);
        System.out.println(res);
    }
    static int minimum(int[] arr){
        int min = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }

        }
        return min;
    }
}
