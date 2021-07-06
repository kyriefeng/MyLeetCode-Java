/**
 * @author Kyrie
 * @description
 * @version
 * @create 2021-06-23-10:58
 */

import java.util.Arrays;

/**
 @description
 @create 2021-06-23-10:58
 */
public class LeetCode283 {
    public void moveZeroes(int[] nums) {
        int k=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=0){
                nums[k++]=nums[i];
            }
        }
        for (int i = k; i <nums.length ; i++) {
            nums[i]=0;
        }
    }

    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        new LeetCode283().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
