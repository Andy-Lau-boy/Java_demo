package Algorithm.BinarySearch;

//二分法模板

public class BinarySearch {

    public int binarySearchLast(int []nums,int target){
//        目标值的最后一个：[1,2,2,3] target=2, return 2;
        if(nums.length==0||nums==null){
            return -1;
        }

        int start=0,end=nums.length-1;
//        用start+1<end是因为防止出现死循环，即start可能不会动
        while(start+1<end){
//            这样写是为了防止start+end超出int的范围
            int middle=start+(end-start)/2;
            if(nums[middle]==target){
                start=middle;
            }
//            end等于middle或者middle+1并不会影响结果
            if(nums[middle]>target){
                end=middle;
            }
            if(nums[middle]<target){
                start=middle;
            }
        }

//        因为结束条件是start+1<end,所以最后要判断start,end
        if(nums[end]==target){
            return end;
        }

        if(nums[start]==target){
            return start;
        }

        return -1;
    }

    public int binarySearchFirst(int []nums,int target){
//        目标值的最后一个：[1,2,2,3] target=1, return 1;
        if(nums.length==0||nums==null){
            return -1;
        }

        int start=0,end=nums.length-1;
//        用start+1<end是因为防止出现死循环，即start可能不会动
        while(start+1<end){
            int middle=start+(end-start)/2;
            if(nums[middle]==target){
                end=middle;
            }
//            end等于middle或者middle+1并不会影响结果
            if(nums[middle]>target){
                end=middle;
            }
            if(nums[middle]<target){
                start=middle;
            }
        }

//        因为结束条件是start+1<end,所以最后要判断start,end
        if(nums[start]==target){
            return start;
        }

        if(nums[end]==target){
            return end;
        }

        return -1;
    }

}
