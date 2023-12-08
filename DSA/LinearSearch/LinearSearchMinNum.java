public class LinearSearchMinNum {
    public static void main(String[] args) {
        Integer[] arr={9,2,3,4,5,1,7};
int k=findminimumNumber(arr);
System.out.println(k);
        
    }
    public  static <T> int findminimumNumber(Integer[] arr){
        //chaeck if list is empty
        if(arr.length==0){
            return -1;
        }
        int minKey=arr[0];
        //check min num through loop
        for (Integer loopInt : arr) {
            if(minKey>loopInt.intValue()){
                minKey=loopInt;
            }
          }
        //return min num
        return minKey;
    }
}
