/**
 * @author Kyrie
 * @description
 * @version
 * @create 2021-04-17-18:41
 */

import java.util.TreeSet;

/**
 @ClassName LeetCode220
 @description 给你一个整数数组 nums 和两个整数 k 和 t 。请你判断是否存在 两个不同下标 i 和 j，
 使得 abs(nums[i] - nums[j]) <= t ，同时又满足 abs(i - j) <= k
 @create 2021-04-17-18:41
 */
public class LeetCode220 {
    public boolean containsNearbyAlmostDuplicate1(int[] nums, int k, int t) {
        for (int i = 0; i <nums.length-1 ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(Math.abs(nums[i]-nums[j])<=t){
                    if(Math.abs(i- j)<=k){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        int n = nums.length;
        TreeSet<Long> set = new TreeSet<Long>();
        for (int i = 0; i < n; i++) {
            Long ceiling = set.ceiling((long) nums[i] - (long) t);
            if (ceiling != null && ceiling <= (long) nums[i] + (long) t) {
                return true;
            }
            set.add((long) nums[i]);
            if (i >= k) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums={-1,2147483647};
        int k=1;
        int t=2147483647;
        System.out.println(new LeetCode220().containsNearbyAlmostDuplicate(nums,k,t));
    }
}
