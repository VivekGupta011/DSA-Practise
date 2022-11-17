package LinearSearch;

public class CheckElement {
    public static void main(String[] args) {
        int[] arr = { 22, 3, 31, 12, 25, 10, 18, 19 };
        int targett = 199;
        CheckElement bb=new CheckElement();
        System.out.println(bb.LinearSearch(arr, targett));

    }

    public int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;

        }

        // for loop for each iteration
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {

                return element;
            }
        }
        return -1;
    }

}
