import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(Lifecycle.PER_CLASS)
public class StringHelperTest {



        private StringHelper word;

        @BeforeAll
        void EveryClassTestString(TestInfo testInfo, TestReporter reporter){
            this.word = new StringHelper();
            System.out.println("New letter is capitalized and the word is palindrome");
            reporter.publishEntry("test",testInfo.getDisplayName().toString());
        }


        @ParameterizedTest
        @DisplayName("Capitalized letter")
        @MethodSource("generateCapitalizedLetter")
        public void shouldcapitalizeLetter(String a,String b){


            assertEquals(this.word.capitalizeFirst(a),b);
        }
    private static Stream <Arguments> generateCapitalizedLetter(){

        return Stream.of(
                Arguments.of("car","Car"),
                Arguments.of("racecar","Racecar"),
                Arguments.of("elefant","Elefant")
        );
    }

        @ParameterizedTest
        @DisplayName("Palindrome word")
        @MethodSource("generatePalindromeCombinations")
        public void shouldTheWordBePalindrome(String a){


            assertTrue(this.word.isPalindrome(a));
        }
    private static Stream<Arguments> generatePalindromeCombinations() {
        return Stream.of(
                Arguments.of("letter"),
                Arguments.of("racecar"),
                Arguments.of("elefant")
        );
    }


}
