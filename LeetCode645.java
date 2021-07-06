/**
 * @author Kyrie
 * @description
 * @version
 * @create 2021-07-02-14:24
 */

import java.util.Arrays;

/**
 * @description
 * @create 2021-07-02-14:24
 */
public class LeetCode645 {
    public int[] findErrorNums(int[] nums) {
        /**
         @description
         @Param [nums:是一个包含1——n的集合，不一定按照顺序排列]
         @return int[]
         **/
        Arrays.sort(nums);
        //遍历索引
        int i = 0;
        //错误元素
        int a = 0;
        //应调为正确的元素，初始值为1
        int b = 1;
        while (i < nums.length - 1) {
            if (nums[i] == nums[i + 1]) {
                a = nums[i];
            }
            if (nums[i + 1] - nums[i] > 1) {
                //不满足该条件的，可能为：1 1或2,2,3
                b = nums[i] + 1;
            }
            i++;
        }
        int[] answer = {a, nums[nums.length - 1] != nums.length ? nums.length : b};
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3};
        System.out.println(Arrays.toString(new LeetCode645().findErrorNums(nums)));
    }
}
