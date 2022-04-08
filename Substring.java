package substring;


public class Substring {
static String findLongestSubString(String string) {
        int size = string.length();
        int LCSRe[][] = new int[size + 1][size + 1];
 
        String results = ""; 
        int length = 0; 
 
       
        int i, index = 0;
        for (i = 1; i <= size; i++) {
            for (int j = i + 1; j <= size; j++) {
                
                if (string.charAt(i - 1) == string.charAt(j - 1)
                        && LCSRe[i - 1][j - 1] < (j - i)) {
                    LCSRe[i][j] = LCSRe[i - 1][j - 1] + 1;
 
                   
                    if (LCSRe[i][j] > length) {
                        length = LCSRe[i][j];
                        index = Math.max(i, index);
                    }
                } else {
                    LCSRe[i][j] = 0;
                }
            }
        }
 
        if (length > 0) {
            for (i = index - length + 1; i <= index; i++) {
                results += string.charAt(i - 1);
            }
        }
        else{
            System.out.println("Longest substring is not present in the given StringBuilder");
        }
 
        return results;
    }
   
    public static void main(String[] args) {
       String str = "playerplay";
        System.out.println(findLongestSubString(str));
    }
    
}



