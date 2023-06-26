package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result=new ArrayList<>();

        // 排序
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){

            int left=i+1;
            int right=nums.length-1;

            if(i>0 && nums[i]==nums[i-1]) continue;

            int target=0-nums[i];

            while(left<right){

                if(nums[left]+nums[right]==target){
                    ArrayList<Integer> array=new ArrayList<>();
                    array.add(nums[i]);
                    array.add(nums[left]);
                    array.add(nums[right]);
                    result.add(array);

                    while(left < right && nums[left+1] == nums[left]) ++left;
                    while (left < right && nums[right-1] == nums[right]) --right;
                    left++;
                    right--;
                }

                if(nums[left]+nums[right]>target){
                    right--;
                }

                if(nums[left]+nums[right]<target){
                    left++;
                }

            }

        }

        return result;
    }

    public static void main(String[] args) {
        int [] nums={0,0,0};
        Solution solution=new Solution();
        System.out.println(solution.threeSum((nums)));

    }
}
