import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestInstance(Lifecycle.PER_CLASS)
public class CalculatorTest {
    private Calculator calculator;
    @BeforeAll
    void EveryClassTestInit(TestInfo testInfo,TestReporter reporter){
        this.calculator = new Calculator();
        System.out.println("New instance calculator created");
        reporter.publishEntry("test",testInfo.getDisplayName().toString());
    }

    @Test
    @DisplayName("Add two numbers")

    public void shouldAddTwoNumbers(){

        assertEquals(this.calculator.add(5,4),9);
    }

    @ParameterizedTest
    @MethodSource("generateMultiplicationCombinations")
    void shouldMulTwoNumbers(int first, int second, int expectation) {
        assertEquals(expectation, calculator.mul(first, second));
    }

    private static Stream<Arguments> generateMultiplicationCombinations() {
        return Stream.of(
                Arguments.of(5, 4, 20),
                Arguments.of(2, 3, 6),
                Arguments.of(5, 8, 40)
        );
    }
}
