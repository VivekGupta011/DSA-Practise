package BinarySearch;

public class FindCharacter {
    public static void main(String[] args) {
        char[] letters={'a','b','c','d','e'};
        char target='d';
        char ans=nextGreatestLetter(letters,target);
        System.out.println("Answer is:"+ans);
        
        
    }
    public static char nextGreatestLetter(char[] letters,char target){
        char res=letters[0];
        int start=0;
        int end=letters.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            System.out.println("mid:"+mid);
            if(target<letters[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        } 
        return res;
    }
}
