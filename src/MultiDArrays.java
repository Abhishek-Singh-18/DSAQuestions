import java.util.Arrays;
import java.util.Scanner;

public class MultiDArrays {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner input = new Scanner(System.in);

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = input.nextInt();
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0;i<3;i++){
            System.out.print(Arrays.toString(arr[i]) + " ");
        }
        for(int[] row : arr){
            System.out.println(Arrays.toString(row));
        }

    }
}
