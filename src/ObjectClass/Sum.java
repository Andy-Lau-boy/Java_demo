package ObjectClass;

import java.util.ArrayList;

public class Sum {

    ArrayList <Integer>data=new ArrayList<Integer>(20);

//    for(int i=0;i<20;i++){
//        data.add(i+1);
//    }

    void init(){
        for(int i=0;i<20;i++){
            data.add(i+1);
        }
    }


    void sum(int target){
        for(int one=0;one<data.size();one++){
            for(int two=0;two<data.size();two++){
                for(int three=0;three<data.size();three++){
                    if(data.get(one)+data.get(two)+data.get(three)==target){
                        System.out.println(data.get(one)+" "+data.get(two)+" "+data.get(three));
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Sum sum=new Sum();
        sum.init();
//        System.out.println(sum.data.get(0));
        sum.sum(13);
    }

}
