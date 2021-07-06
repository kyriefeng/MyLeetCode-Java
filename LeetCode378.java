/**
 * @author Kyrie
 * @description
 * @version
 * @create 2021-06-28-15:28
 */

/**
 * @description 解题思路：LeetCode官网题解法三
 * 我们知道整个二维数组中 matrix[0][0]matrix[0][0] 为最小值，matrix[n - 1][n - 1]matrix[n−1][n−1] 为最大值，现在我们将其分别记作 l 和 r。
 * 可以发现一个性质：任取一个数 midmid 满足 l≤mid≤r，那么矩阵中不大于 mid 的数，肯定全部分布在矩阵的左上角。
 * 矩阵中大于 mid的数就和不大于 mid的数分别形成了两个板块，沿着一条锯齿线将这个矩形分开。其中左上角板块的大小即为矩阵中不大于 mid的数的数量。
 * 可以这样描述走法：
 * 初始位置在 matrix[n - 1][0]matrix[n−1][0]（即左下角）；
 * 设当前位置为 matrix[i][j]matrix[i][j]。若 matrix[i][j]≤mid，则将当前所在列的不大于 mid的数的数量（即 i + 1）累加到答案中，并向右移动，否则向上移动；
 * 不断移动直到走出格子为止。
 * 如果数量不少于 k，那么说明最终答案 x 不大于 mid；
 * 如果数量少于 k，那么说明最终答案 x大于 mid。
 * @create 2021-06-28-15:28
 */
public class LeetCode378 {
    public int kthSmallest(int[][] matrix, int k) {
        //到这已经得到count的值，需要对count与k进行比较，来改变mid的值
        //如果数量不少于 k，那么说明最终答案 x 不大于 mid；
        //如果数量少于 k，那么说明最终答案 x大于 mid。
        //首先将mid设置成矩阵最大值和最小值的平均
        int left=matrix[0][0];
        int right=matrix[matrix.length - 1][matrix[0].length - 1];
        int mid;
        int count;
        while (left<right){
            mid=(left+right)/2;
            count=countMid(matrix,mid);
            if (count < k) {
                // 第k小的数在右半部分，且不包含mid
                left = mid + 1;
            } else {
                // 第k小的数在左半部分，可能包含mid
                right = mid;
            }
        }
        return right;
    }
    private static int countMid(int[][] matrix,int mid) {
    //小于等于mid的值的个数
        int count = 0;
        //设置当前的位置，初始值应从左下角开始走
        int row = matrix.length - 1;
        int column = 0;
        if(mid<matrix[0][0]){
            return 0;
        }
        else {
            while (row >= 0 && column <= matrix[0].length - 1) {
                if (matrix[row][column] <= mid) {
                    count = count + (row + 1);
                    column++;
                } else {
                    row--;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        int [][]matrix={{1,5,9},{10,11,13},{12,13,15}};
        //int [][]matrix={{1,4},{2,5}};
        int k=2;
        System.out.println(new LeetCode378().kthSmallest(matrix,k));
    }
}


