public class Exercise7 {
    public static void main(String[] args) {
        String str = "abcdbeghef";
        System.out.println(longestSubstringWithoutRepeating(str));
 
    }
    static boolean withoutRepeating(String str){
    boolean[] visited = new boolean[128];
    for(int i = 0; i < str.length(); i++){
      if(visited[(int) str.charAt(i)]) return true;
      else visited[(int) str.charAt(i)] = false;
    }
    return true;
  }
    public static int longestSubstringWithoutRepeating(String str){
        String[] arrOfStr = str.split("");
        int count = 0;
        for (int i = 0; i < arrOfStr.length; i++) {
            if(withoutRepeating(str)){
                count++;
            }
            
            for (int j = i+1; j < arrOfStr.length; j++) {
                if(arrOfStr[i] == arrOfStr[j]){
                    count--;
                }
                    
                
            }
            
        }
        return count;
    }
}

  
