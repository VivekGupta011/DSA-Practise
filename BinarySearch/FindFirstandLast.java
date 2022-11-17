package BinarySearch;

import java.util.Arrays;



public class FindFirstandLast {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int target=7;
        FindFirstandLast bb=new FindFirstandLast();
        int[] result= bb.SearchRange(arr, target);
        System.out.println("Ans is:"+Arrays.toString(result));
        
    }
    public int[] SearchRange(int[] arr,int target){
        int[] ans={-1,-1};
        //check for first occurrance if target first
        int start=search(arr, target, true);
        int end=search(arr, target, false);

        ans[0]=start;
        ans[1]=end;
        return ans;

        
       
    }
    //this function just returns the index value of target
    int search(int[] arr,int target,boolean findstartindex){

        int ans=-1;
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            //find middle element
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                //potential ans found
                ans=mid;
                if(findstartindex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }  
        }
        return ans;  

    }

}
