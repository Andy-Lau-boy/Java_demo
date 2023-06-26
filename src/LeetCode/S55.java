package LeetCode;

public class S55 {

//    题解：
//    对于每个格子都做一个起跳点，能跳多远，慢慢更新最远值
//    然后要判断能不能跳到i，即(i>max)是否成立

    public boolean canJump(int[] nums) {

        int max=0;

        for(int i=0;i<nums.length;i++){

            if(i>max) return false;

            max=Math.max(max,i+nums[i]);
        }

        return true;
    }

    public static void main(String[] args) {

        S55 s=new S55();
        int []nums = {2,3,1,1,4};
        System.out.println(s.canJump(nums));
    }
}
