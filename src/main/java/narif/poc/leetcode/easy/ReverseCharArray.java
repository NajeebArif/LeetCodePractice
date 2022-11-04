package narif.poc.leetcode.easy;

public class ReverseCharArray {

    public void reverseString(char[] s) {

    }

    public char[] reversedCharArray(char[] s){
        int i,j;
        for(i=0, j=s.length-1;i<j;i++,j--){
            swapChars(s, i, j);
        }
        return s;
    }

    private static void swapChars(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

}
