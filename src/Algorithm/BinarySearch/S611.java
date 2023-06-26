package Algorithm.BinarySearch;

import java.util.Arrays;

public class S611 {
    public int triangleNumber(int[] nums) {

//        排序一下
        Arrays.sort(nums);
        int result=0;

        for(int i=0;i<nums.length;i++){
            int left=0,right=i-1;
            while(left<right){
                if(nums[left]+nums[right]>nums[i]){
                    result+=right-left;
                    right--;

                }else{
                    left++;
                }
            }
        }
        return result;
    }
}
