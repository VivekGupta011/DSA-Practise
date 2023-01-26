package Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Find_k_largest_and_smallest_Element {
    // function to find k'th largest element in a array using min-heap
    public static int findKSmallest(List<Integer> list,int k){

        //base case
        if(list==null || list.size()<k){
            System.exit(-1);
        }

        // create a min-heap using the 'PriorityQueue' class and insert
        // Note:for converting (build) max-heap use 'Comparator.reverseOrder()'
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(list.get(i));
        }

        for(int i=k;i<list.size();i++){

            //if current element is more than the root of the heap
            if(list.get(i)>pq.peek()){
                pq.poll();
                pq.add(list.get(i));

            }
        }
        return pq.peek();

    }

    // Note For converting max heap you have to just pass 'Comparator.reverseOrder()'
    // function to find k'th largest element in a array using max-heap
    public static int findKlargest(List<Integer> list,int k){

        //base case
        if(list==null || list.size()<k){
            System.exit(-1);
        }

        // create a min-heap using the 'PriorityQueue' class and insert
        // Note:for converting (build) max-heap use 'Comparator.reverseOrder()'
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(list.get(i));
        }

        for(int i=k;i<list.size();i++){

            //if current element is more than the root of the heap
            if(list.get(i)<pq.peek()){
                pq.poll();
                pq.add(list.get(i));

            }
        }
        return pq.peek();

    }

    public static void main(String[] args) {
        // List<Integer> list=new ArrayList<>();
        List<Integer> list=Arrays.asList(7,4,6,3,9,1);
        int k=3;
        System.out.println("K smallest element is:"+findKlargest(list, k));
        System.out.println("K largest element is:"+findKSmallest(list, k));
        
    }
    
}
