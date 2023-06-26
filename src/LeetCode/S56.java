package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S56 {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a, b)->{return a[0]-b[0];});

        List<int[]> res=new ArrayList<>();

//        左右分别记录现在区间节点
        int left=intervals[0][0];
        int right=intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=right){
//                可以归并
                right=Math.max(intervals[i][1],right);
            }else{
//                不可以归并，存储下来
                res.add(new int[]{left,right});

//                更新左右节点
                left=intervals[i][0];
                right=intervals[i][1];
            }
        }

//        保存最后一组区间
        res.add(new int[]{left,right});

        int [][] ans=new int[res.size()][2];
        for(int i=0;i<res.size();i++){
            ans[i][0]=res.get(i)[0];
            ans[i][1]=res.get(i)[1];
        }
        return ans;
    }

    public static void main(String[] args) {

        int [][] intervals = {{1,3},{2,6},{8,10},{15,18}};

        S56 s=new S56();

        int [][] result=s.merge(intervals);

        for(int i=0;i<result.length;i++){
            System.out.println(result[i][0]+" "+result[i][1]);
        }
    }
}
