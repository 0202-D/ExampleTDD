import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dm.Petrov
 * DATE: 24.09.2022
 */
class CreditCalculatorTest {
    CreditCalculator creditCalculator;

    @BeforeEach
    void init() {
        creditCalculator = new CreditCalculator();
    }

    @ParameterizedTest
    @MethodSource("source")
    void monthlyPaymentCalculationTest(int creDitSum, int numberOfMonth, int expected) {
        int result = creditCalculator.monthlyPaymentCalculation(creDitSum, numberOfMonth);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> source() {
        return Stream.of(Arguments.of(100000, 12, 9833),
                Arguments.of(125000, 6, 24583));
    }

    @ParameterizedTest
    @MethodSource("source2")
    void amountToBeReturnedToTheBankTest(int creditSum, int expected) {
        int result = creditCalculator.amountToBeReturnedToTheBank(creditSum);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> source2() {
        return Stream.of(Arguments.of(20000,23600),
                Arguments.of(73000,86140));
    }

    @ParameterizedTest
    @MethodSource("source3")
    void overpaymentForTheEntirePeriodTest(int creditSum,int expected) {
        int result = creditCalculator.overpaymentForTheEntirePeriod(creditSum);
        assertEquals(expected, result);
    }

    private static Stream<Arguments> source3() {
        return Stream.of(Arguments.of(500000,90000),
                Arguments.of(1000,180));
    }

}
