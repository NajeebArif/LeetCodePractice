package narif.poc.leetcode.easy;

import lombok.extern.slf4j.Slf4j;

//@Slf4j
public class ReverseVowelsV2 {

    public String reverseVowels(String input){
        final var chars = input.toCharArray();
        int i, j;
        for(i = 0, j = chars.length-1;i<j;){
            if(!isVowel(chars[i]))
                i++;
            if(!isVowel(chars[j]))
                j--;
            if(isVowel(chars[i]) && isVowel(chars[j])){
                swapVowels(chars, i, j);
                i++;j--;
            }
        }
        return new String(chars);
    }

    private void swapVowels(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    private static boolean isVowel(char ch){
        return ch=='a' || ch == 'e' || ch == 'i' || ch=='o' || ch=='u' ||
        ch=='A' || ch == 'E' || ch == 'I' || ch=='O' || ch=='U';
    }
}
