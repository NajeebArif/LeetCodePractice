package narif.poc.leetcode.easy;

public class ReverseKfor2kStr {

    //TODO: 1.1 reverse first k for every 2k
    //TODO: 1.2 if fewer than k reverse all of them
    //TODO: 1.3 if less than 2k but greater than and equal to k then reverse first k

    public String revSt(String s, int k){
        final var chars = s.toCharArray();
        for(int block = 0; block < chars.length; block+=2*k){
            int i = block;
            int j = Math.min(block+k-1, chars.length-1);
            while(i<j){
                char t = chars[i];
                chars[i++] = chars[j];
                chars[j--] = t;
            }

        }
        return new String(chars);
    }
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for (int start = 0; start < a.length; start += 2 * k) {
            int i = start, j = Math.min(start + k - 1, a.length - 1);
            while (i < j) {
                char tmp = a[i];
                a[i++] = a[j];
                a[j--] = tmp;
            }
        }
        return new String(a);
    }
}
