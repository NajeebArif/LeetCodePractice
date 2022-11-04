package narif.poc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReverseCharArrayTest {

    @Test
    void test1(){
        char[] s = {'h','e','l','l','o'};
        final var reverseCharArray = new ReverseCharArray();
        final var chars = reverseCharArray.reversedCharArray(s);
        assertThat(chars).containsExactly('o','l','l','e','h');
        final var chars1 = reverseCharArray.reversedCharArray(new char[]{'H', 'a', 'n', 'n', 'a', 'h'});
        assertThat(chars1).containsExactly('h','a','n','n','a','H');
    }



}