/**
 * @author Kyrie
 * @description
 * @version
 * @create 2021-06-25-11:22
 */

/**
 * @description
 * @create 2021-06-25-11:22
 */
public class LeetCode240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int mid;
        int left;
        int right;
        for (int i = 0; i <matrix.length ; i++) {
            mid=0;
            left=0;
            right=matrix[0].length-1;
            while (left<=right){
                mid=(left+right)/2;
                if(matrix[i][mid]==target){
                    return true;
                }else if(matrix[i][mid]<target){
                    //向右寻找
                    left=mid+1;
                }else if (matrix[i][mid]>target){
                    //向左寻找
                    right=mid-1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(new LeetCode240().searchMatrix(matrix,30));
    }
}
