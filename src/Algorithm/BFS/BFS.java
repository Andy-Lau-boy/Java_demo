package Algorithm.BFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Queue;


public class BFS {

//    访问的时候不分层
    private ArrayList<UndirectedGraphNode> getNodes(UndirectedGraphNode node){

        Queue<UndirectedGraphNode> quene=new ArrayDeque<UndirectedGraphNode>();
//        set记录是否已经访问过
        HashSet<UndirectedGraphNode> set=new HashSet<UndirectedGraphNode>();

//        只要入队就要立刻记录到set
        quene.offer(node);
        set.add(node);

        while(!quene.isEmpty()){
            UndirectedGraphNode head=quene.poll();
            for(UndirectedGraphNode neighbor:head.neighbors){
                if(!set.contains(node)){
//                    入队就要记录到set,否则会造成元素重复入队
                    set.add(neighbor);
                    quene.offer(neighbor);
                }

            }
        }

        return new ArrayList<>(set);

    }


//    访问的时候分层访问
    private ArrayList<UndirectedGraphNode> getNodes_byLevel(UndirectedGraphNode node){

        Queue<UndirectedGraphNode> quene=new ArrayDeque<UndirectedGraphNode>();
        HashSet<UndirectedGraphNode> set=new HashSet<UndirectedGraphNode>();

        quene.offer(node);
        set.add(node);

        while(!quene.isEmpty()){
            int size=quene.size();

            for(int i=0;i<size;i++){
                UndirectedGraphNode head=quene.poll();
                for(UndirectedGraphNode neighbor:head.neighbors){
                    if(!set.contains(node)){
                        set.add(neighbor);
                        quene.offer(neighbor);
                    }

                }
            }
        }

        return new ArrayList<>(set);

    }
}
