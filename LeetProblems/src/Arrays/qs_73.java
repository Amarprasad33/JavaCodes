package Arrays;

import java.lang.reflect.Array;
import java.util.*;
public class qs_73 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        setZeroes(arr);
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));


    }

    public static void setZeroes(int[][] matrix) {
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    trasform(matrix, i, j);
                }
            }
        }

        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix[0].length; j++){
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }


    }

    private static void trasform(int[][] matrix, int i, int j) {
        for(int k = 0; k< matrix.length; k++){
            if(matrix[i][k] != 0){
                matrix[i][k] = -1;
            }
        }

        for(int k = 0; k< matrix.length; k++){
            if(matrix[k][j] != 0){
                matrix[k][j] = -1;
            }
        }
    }
}
