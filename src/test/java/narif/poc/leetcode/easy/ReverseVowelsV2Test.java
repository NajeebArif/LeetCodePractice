package narif.poc.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReverseVowelsV2Test {
    final ReverseVowelsV2 reverseVowelsV2 = new ReverseVowelsV2();

    @Test
    void testaA(){
        final var aA = reverseVowelsV2.reverseVowels("aA");
        assertThat(aA).isEqualTo("Aa");
        final var hello = reverseVowelsV2.reverseVowels("Hello");
        assertThat(hello).isEqualTo("Holle");
        final var leetcode = reverseVowelsV2.reverseVowels("leetcode");
        assertThat(leetcode).isEqualTo("leotcede");
    }

    @Test
    void testTowCharString(){

        final var abe = reverseVowelsV2.reverseVowels("abe");
        assertThat(abe).isEqualTo("eba");
    }

}