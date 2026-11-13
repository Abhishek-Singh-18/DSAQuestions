public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int target = 3;
        int result = linearSearch(arr, target);
        System.out.println(result);

        int result2 = linearSearch2(arr, target, 1, 3);
        System.out.println(result2);
    }
    static int linearSearch(int[] arr, int target) {
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    static int linearSearch2(int[] arr, int target,int start,int end) {
        if(arr.length==0){
            return -1;
        }
     for(int i=start;i<=end;i++){
     if(arr[i]==target){

         return i;
     }

            }
     return -1;
        }


}
