package Stack;

public class NearestElementToRight {
    public static void nextGreaterElement(int[] nums1) {
        
        int next;
        for(int i=0;i<nums1.length;i++){
            next=-1;
            for(int j=i+1;j<nums1.length;j++){
                if(nums1[i]>nums1[j]){
                    next=nums1[j];
                    break;
                }
            }
            System.out.print(next+" ");
        }
        
    }
    public static void main(String[] args) {
        NearestElementToRight obj=new NearestElementToRight();
        int[] nums1={1,3,2,4};
        nextGreaterElement(nums1);
        
    }
    
}
