package OnlineTest.ShunFeng;

public class S {

//    int [] data={1,2,3,3,4};

    public int search(int []data,int target){

        int start=0;
        int end=data.length-1;
        while(start+1<end){
            int middle=(end+start)/2;
            if(data[middle]==target){
                start=middle;
            }

            if(data[middle]>target){
                end=middle;
            }

            if(data[middle]<target){
                start=middle;
            }
        }

        if(data[end]==target){
            return end;
        }

        if(data[start]==target){
            return start;
        }

        return -1;
    }

    public static void main(String[] args) {
        S s=new S();
        int [] data={1,2,3,3,4};
        int target=3;
        System.out.println(s.search(data,target));
    }

}
