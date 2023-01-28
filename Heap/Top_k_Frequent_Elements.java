package Heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Top_k_Frequent_Elements {

    public static int[] TopKFrequent(int[] nums,int k){
        // Creating a Hashmap for storing count
        HashMap<Integer,Integer> map=new HashMap<>();
        // for storing count of number
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        // taking maxheap for getting value
         //creating a max heap by just passing 'Collections.reverseOrder()'
         PriorityQueue<Integer> max_heap=new PriorityQueue<Integer>((a, b) -> map.get(b) - map.get(a));
         for(int i:map.keySet()){
            max_heap.add(i);
         }

        //  creating array
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=max_heap.poll();
        }
        return result;

    }
    public static void main(String[] args) {

        int[] array={1,1,1,2,2,3};
        int k=2;
        System.out.println("Ans is:"+Arrays.toString(TopKFrequent(array, k)));
        
    }
    
}
