/**
 * @author Kyrie
 * @description
 * @version
 * @create 2021-07-06-10:50
 */

import java.util.Arrays;

/**
 @description
 @create 2021-07-06-10:50
 */
public class LeetCode287 {
    //给定一个包含 n + 1 个整数的数组 nums ，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。
    //假设 nums 只有 一个重复的整数 ，找出 这个重复的数 。
    //你设计的解决方案必须不修改数组 nums 且只用常量级 O(1) 的额外空间。
    public int findDuplicate(int[] nums) {
        //不能修改数组！
        /*Arrays.sort(nums);
        int i;
        for (i = 0; i <nums.length-1 ; i++) {
            if(nums[i]==nums[i+1]){
                break;
            }
        }
        return nums[i];*/
        
    }

    public static void main(String[] args) {
        int[] nums={1,1,2};
        System.out.println(new LeetCode287().findDuplicate(nums));
    }
}
