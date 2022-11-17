package LinearSearch;

public class LeetcodeProblem2 {
    public static void main(String[] args) {
     int[] a={123,34,3434,121,12};
     System.out.println(findNumber(a));   
    }

    static int numberOfDigits(int n){
        int count=0;
        System.out.println("n:"+n);
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
    


    static int findNumber(int[] a){
        int result=0;
        for(int i=0;i<a.length;i++){
            if(numberOfDigits(a[i])%2==0){
                System.out.println("array:"+a[i]);
                result++;
            }
        }
        return result;
    }
}
