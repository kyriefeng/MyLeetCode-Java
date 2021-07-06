/**
 * @author Kyrie
 * @description
 * @version
 * @create 2021-06-24-18:04
 */

/**
 @description
 @create 2021-06-24-18:04
 */
public class LeetCode485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        //nums:二进制数组
        int answer=0;
        int consecution=0;
        for (int i = 0; i <nums.length ; i++) {

            consecution=0;
            while (nums[i]==1){
                consecution++;
                if(i<nums.length-1){
                    i++;
                }else {
                    break;
                }
            }
            if(consecution>answer){
                answer=consecution;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums={1,1,0,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,0,0};
        System.out.println(new LeetCode485().findMaxConsecutiveOnes(nums));
    }
}
