/**
 * @author Kyrie
 * @description
 * @version
 * @create 2021-06-23-14:39
 */

import java.util.Arrays;

/**
 @description
 @create 2021-06-23-14:39
 */
public class LeetCode566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        //行数
        int r1=mat.length;
        //列数
        int c1=mat[0].length;
        if(r*c!=r1*c1){
            return mat;
        }else {
            int[][] mat1 = new int[r][c];
            //一维temp数组用于存储二维数组的全部元素
            int[] temp = new int[r1 * c1];
            int k=0;
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j <c1 ; j++) {
                    temp[k++]=mat[i][j];
                }
            }
            k=0;
            //借助temp数组将元素传递给新的数组
            for (int i = 0; i <r ; i++) {
                for (int j = 0; j <c ; j++) {
                    mat1[i][j]=temp[k++];
                }
            }
            return mat1;
        }
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2},{3,4}};
        int r = 2, c = 4;
        int[][] reshape = new LeetCode566().matrixReshape(nums, r, c);
        System.out.println(Arrays.deepToString(reshape));
    }
}
