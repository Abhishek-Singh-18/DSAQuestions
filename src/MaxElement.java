public class MaxElement {
    public static void main(String[] args){
        int[] arr={1,2,3,44,5};
        int max = findMax(arr);
        System.out.println("The maximum element is: " + max);
        int maxIndex = MaxIndex(arr);
        System.out.println("The index of the maximum element is: " + maxIndex);

        int maxRangeIndex = MaxRange(arr, 1, 3);
        System.out.println("The index of the maximum element in the range is: " + maxRangeIndex);
    }
    static int findMax(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }
    static int MaxIndex(int [] arr){
        int maxIndex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[maxIndex]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }

    static int MaxRange(int[] arr,int start,int end){
        int maxIndex=start;

        for(int i=start;i<=end;i++){
            if(arr[i]>arr[maxIndex]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}
