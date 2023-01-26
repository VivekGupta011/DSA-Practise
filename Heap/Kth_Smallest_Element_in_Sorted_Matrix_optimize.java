package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_Smallest_Element_in_Sorted_Matrix_optimize {
    // Brute force time complaxity o(n^2)
    // public int kthSmallest(int[][] matrix, int k) {
    //     ArrayList<Integer> list=new ArrayList<>();

    //     // using nested loop for inserting value inside of arraylist
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[i].length;j++){
    //             list.add(matrix[i][j]);
    //         }
    //     }

    //     // Sorting ArrayList
    //     Collections.sort(list);
    //     int result=0;
    //     for(int i=0;i<list.size();i++){
    //         if(i==k-1){
    //             result=list.get(i);
    //         }
    //     }

    //     return result;
        
        
    // }
    
    // optimized solution time complaxity O(k log n) because we are iterating over n elements and in each iteration, we are    adding or removing an element from the heap which takes O(log n) time.
    public static int kthSmallest(int[][] matrix, int k) {

        //creating a max heap by just passing 'Collections.reverseOrder()'
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(pq.size()<k){
                    pq.add(matrix[i][j]);
                }else{
                    if(pq.peek()>matrix[i][j]){
                        pq.poll();
                        pq.add(matrix[i][j]);
                    }
                }
            }
        }

        return pq.poll();

    }
    public static void main(String[] args) {

        // creation matrix
        int[][] matrix={{1,5,9},{10,11,13},{12,13,15}};
        System.out.println("Ans is:"+kthSmallest(matrix, 8));
        
    }
    
}
