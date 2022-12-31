package Hashing;

import java.util.HashMap;

public class Majority_Element {

    public static void MajorityElementt(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // for loop for traversing all element
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int count = map.get(nums[i]) + 1;
                if (count > nums.length / 3) {
                    System.out.print(nums[i] + " ");
                    flag = 1;
                } else {
                    map.put(nums[i], count);
                }

            } else {
                map.put(nums[i], 1);
            }
        }

        System.out.println("Ans is:"+map);

        // if not found
        if(flag==0){
            System.out.print("No majority element!");
        }

    }

    public static void main(String[] args) {
        int[] a= new int[]{2, 2, 3, 1, 3, 2, 1, 1};
        MajorityElementt(a);
    }
    
}
