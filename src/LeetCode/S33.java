package LeetCode;

public class S33 {

    public int search(int[] nums, int target) {

        int left=0;
        int right=nums.length-1;

        while(left<=right) {

            int middle = (left + right) / 2;

            if (nums[middle] == target) {
                return middle;
            }

            if (nums[middle] > nums[left]) {
                if (target > nums[left] && target < nums[middle]) {
                    right = middle-1;
                } else {
                    left = middle;
                }
            } else {
                if (target < nums[right] && target > nums[middle]) {
                    left = middle+1;
                } else {
                    right = middle;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        S33 s33=new S33();
        int [] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int result=s33.search(nums,target);
        System.out.println(result);

        String s="hello";
        System.out.println(s.charAt(2));
    }
}
