package narif.poc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseVowelsTest {

    @Test
    void testReverseVowelsLeetCode(){
        String leetcode = new ReverseVowels().reverseVowels("leetcode");
        assertThat(leetcode).isEqualTo("leotcede");
    }

    @Test
    void testReverseVowelsHello(){
        ReverseVowels reverseVowels = new ReverseVowels();
        String reversedVowels = reverseVowels.reverseVowels("Hello");
        assertThat(reversedVowels).isEqualTo("Holle");
    }

}