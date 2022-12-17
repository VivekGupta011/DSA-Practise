package BinarySearch;

public class NextAlphabeticalElementAdityaVarma {
    public static char NextAlphabet(char[] array,char target){
        int start=0;
        int last=array.length-1;
        char ceil='#';
        
        while(start<=last){
            int mid=(start+last)/2;

            if(array[mid]==target){
                  start=mid+1;
            }
            if(array[mid]>target){
                last=mid-1;
            }
            if(array[mid]<target){
                start=mid+1;
                ceil=array[mid];
            }
        }
        return ceil;
    }

    public static void main(String[] args) {

        char[] array={'a','b','e','p','q','s','z'};
        System.out.println("ans is:"+array.length);
        System.out.println("Ans is:"+NextAlphabet(array, 'q'));

    }
    
}
