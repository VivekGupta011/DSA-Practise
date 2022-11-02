package SearchingSorting;

public class CommonElementTwoArray {
    public static void main(String[] args) {
        int[] a={2,3,4,5,6};
        int[] b={1,3,4,5,8};
        CommonElement(a, b);
        
    }

    public static void CommonElement(int[] a,int[] b){

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    System.out.print(a[i]+" ");
                }
            }
        }

    }
    
}
