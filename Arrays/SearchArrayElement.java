package Arrays;

public class SearchArrayElement {  
    public static int SearchElement(int[] array,int target){

        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {

        int[] array={3,4,5,6,7,5,7,89,6};
        int target=892;
        int Ans=SearchElement(array,target);
        if(Ans!=-1){
            System.out.println("Target present at index number:"+SearchElement(array,target));
        }else{
            System.out.println("Target is Not present at index number");

        }
        
    }
    
}
