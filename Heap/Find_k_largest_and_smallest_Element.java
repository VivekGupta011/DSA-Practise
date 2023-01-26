package Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Find_k_largest_and_smallest_Element {
    // function to find k'th largest element in a array using min-heap
    public static int findKSmallest(List<Integer> list, int k) {
        // base case
        if (list == null || list.size() < k) {
            System.exit(-1);
        }

        // create a min-heap using the 'PriorityQueue' class and insert
        // Note:for converting (build) max-heap use 'Comparator.reverseOrder()'
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(list.get(i));
        }

        for (int i = k; i < list.size(); i++) {

            // if current element is more than the root of the heap
            // this part help if array is not sorted/
            if (list.get(i) > pq.peek()) {
                pq.poll();
                pq.add(list.get(i));

            }
        }
        return pq.peek();

    }

    // Note For converting max heap you have to just pass
    // 'Comparator.reverseOrder()'
    // function to find k'th largest element in a array using max-heap
    public static int findKlargest(List<Integer> list, int k) {

        // base case
        if (list == null || list.size() < k) {
            System.exit(-1);
        }

        // create a min-heap using the 'PriorityQueue' class and insert
        // Note:for converting (build) max-heap use 'Comparator.reverseOrder()'
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < k; i++) {
            pq.add(list.get(i));
        }

        for (int i = k; i < list.size(); i++) {

            // if current element is more than the root of the heap
            if (list.get(i) < pq.peek()) {
                pq.poll();
                pq.add(list.get(i));

            }
        }
        return pq.peek();

    }

    public static void main(String[] args) {
        // List<Integer> list=new ArrayList<>();
        List<Integer> list = Arrays.asList(7, 4, 6, 3, 9, 1);
        int k = 3;
        System.out.println("K smallest element is:" + findKlargest(list, k));
        System.out.println("K largest element is:" + findKSmallest(list, k));

        // Creating an empty HashMap
        HashMap<Integer, Integer> hash_map = new HashMap<Integer, Integer>();

        // Mapping string values to int keys
        hash_map.put(10, 2);
        hash_map.put(15, 5);
        hash_map.put(20, 6);
        hash_map.put(25, 7);
        hash_map.put(30, 8);

        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + hash_map);

        List<Integer> list2 = new LinkedList<>();
        // Using keySet() to get the set view of keys
        System.out.println("The set is: " + hash_map.keySet());
        for (int i : hash_map.keySet()) {
           System.out.println("Value is:"+ list2.add(hash_map.get(i)));

        }
        System.out.println("List2:"+list2);

    }
}
