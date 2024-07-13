package Arrays;

import java.util.*;

public class Matrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int top = 0;
        int right  = matrix[0].length-1;
        int bottom  = matrix.length-1;
        List<Integer> ans = new ArrayList<>();


        while(top <= bottom && right >= left){
            //right
            for(int i =left; i<= right;i++){
                ans.add(matrix[top][i]);
            }
            top ++;
            // bottom

            for(int i =top; i<= bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            // left
            if(top <= bottom){
                for(int i =right; i>= left;i--){
                ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            // top
            if(right >= left){
                for(int i =bottom; i>= top;i--){
                ans.add(matrix[i][left]);
                }
                left++;
            }
            
        }
        return ans;

    }

    public static void setZeroes(int[][] matrix) {
        int col0 = matrix[0][0];
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j]==0) {
                    matrix[i][0] = 0;
                    if(j==0){
                        col0 = 0;
                    }else
                        matrix[0][j] = 0;
                }
            }
        }
        System.out.println("STEP 1");
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j]!=0) {
                    if ( matrix[0][j] == 0 || matrix[i][0] == 0) {
                        matrix[i][j] =0;
                    }
                }
            }
        } 
        System.out.println("STEP 2");
        if (matrix[0][0]==0) {
            for (int i = 0; i < n; i++) {
                matrix[0][i] =0;
            }
        }
        System.out.println("STEP 3");
        if (col0 ==0 ) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] =0;
            }
        }
        System.out.println("STEP 4");
    }


    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] =temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int left = 0;
            int right = n-1;
            while (right>left) {
                int temp = matrix[i][right];
                matrix[i][right] = matrix[i][left];
                matrix[i][left] =temp;
                left++;
                right--;
            }
        }
    }

    private static void displayMatrix(int[][] matrix1) {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        rotate(matrix);


    }
}
