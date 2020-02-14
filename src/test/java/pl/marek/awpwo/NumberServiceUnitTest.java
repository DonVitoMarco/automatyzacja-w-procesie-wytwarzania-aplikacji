package pl.marek.awpwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberServiceUnitTest {

    private NumberService numberService;

    @BeforeEach
    public void before() {
        numberService = new NumberService();
    }

    @Test
    void getTest_shouldReturnCurrentValue() {
        int number = numberService.get();

        assertEquals(number, 0);
    }

    @Test
    void incrementAndGetTest_shouldReturnIncrementValue() {
        int number = numberService.incrementAndGet();

        assertEquals(number, 1);
    }

    @Test
    void decrementAndGetTest_shouldReturnDecrementValue() {
        int number = numberService.decrementAndGet();

        assertEquals(number, -1);
    }
}