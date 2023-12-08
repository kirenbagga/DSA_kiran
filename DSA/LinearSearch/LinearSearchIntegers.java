public class LinearSearchIntegers{
    public static void main(String[] args) {
        int[] arr={};
        int searchKey=9;
        System.out.println(linearSearch(arr, searchKey));
        
    }
    public static int linearSearch(int[] arr,int key){
        //check if array is empty if empty return -1
        if(arr.length==0){
            return -1;
        }
        //itereate through loop
        for (int index = 0; index < arr.length; index++) {
            if(key==arr[index]){
                return key;
            }
        } 
        //if key s not found retrun 1   
        return -1;
    }
}