public class LinearSearchString {
    public static void main(String[] args) {
        String str="kirsfa";
        char ch='s';
        boolean bool=linearSearchForEach(str, ch);
        System.out.println(bool);
        
    }
    public static boolean linearSearchForEach(String str,char ch){
        //check if string is empty
        if(str.length()==0){
            return false;
        }
        //check for char through loop
        for (char loopChar : str.toCharArray()) {
            if(ch==loopChar){
                return true;
            }
        }
        //if char not found return false
        return false;

    }
    public static boolean linearSearch(String str,char ch){
        //check if string is empty
        if(str.length()==0){
            return false;
        }
        //check if char is found
        for (int index = 0; index < str.length(); index++) {
           if(ch==str.charAt(index)) {
            return true;
           }
        }
        //if char not found retrun false
        return false;

    }
    
}
