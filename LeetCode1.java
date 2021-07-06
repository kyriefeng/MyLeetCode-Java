/**
 * @author Kyrie
 * @description
 * @version
 * @create 2021-04-15-16:53
 */

import java.util.Arrays;

/**
 @author admin
  * @ClassName LeetCode1
 @description 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 你可以按任意顺序返回答案
 @create 2021-04-15-16:53
 */
public class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        int si=0,sj=0;
        for (int i = 0; i <nums.length-1; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]+nums[j]==target){
                    si=i;
                    sj=j;
                    break;
                }
            }
        }
        return new int[]{si,sj};
    }

    public static void main(String[] args) {
        LeetCode1 leetCode1=new LeetCode1();
        int[] nums=new int[]{1,5,9,11};
        int target=10;
        System.out.println(Arrays.toString(leetCode1.twoSum(nums,target)));
    }
}
