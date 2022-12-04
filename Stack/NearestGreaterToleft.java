package Stack;

public class NearestGreaterToleft {
     
    public static void NearestGreaterToleftt(int[] nums1){
        int[] array=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int next=-1;
            for(int j=i;j>=0;j--){
                if(nums1[i]<nums1[j]){
                    next=nums1[j];
                    break;
                }
            }
            System.out.print(next + " ");
        }


    }

    public static void main(String[] args) {
        NearestGreaterToleft obj=new NearestGreaterToleft();
        int[] nums={4, 5, 2, 0};
        
        obj.NearestGreaterToleftt(nums);
    }
    
}
