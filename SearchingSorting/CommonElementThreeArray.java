package SearchingSorting;

public class CommonElementThreeArray {
    public static void main(String[] args) {
        int[] a={1,5,6,7,8,9};
        int[] b={5,6,7,15,20,40,50};
        int[] c={3,5,7,50};
        // System.out.println("Ans is:"+CommonElementChecker(a, b, c));
        CommonElementChecker(a, b, c);
        
    }
    public static void CommonElementChecker(int[] a,int[] b,int[] c){
        
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length && k<c.length){
            if(a[i]==b[j] && b[j]==c[k]){
                System.out.print(a[i]);
                i++;
                j++;
                k++;

            }else if(a[i]>b[j]){
                j++;

            }else if(b[j]>c[k]){
                k++;
            }
            else{
                i++;
            }

        }

    }
    
}
