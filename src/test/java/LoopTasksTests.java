import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoopTasksTests {

    @Test
    public void testSumOfOddDigits() {
        assertEquals(1, LoopTasks.sumOfOddDigits(1));
        assertEquals(0, LoopTasks.sumOfOddDigits(2));
        assertEquals(4, LoopTasks.sumOfOddDigits(1234));
        assertEquals(0, LoopTasks.sumOfOddDigits(246));
    }

    @Test
    public void testNumberOfUnitsInBinaryRecord() {
        assertEquals(3, LoopTasks.numberOfUnitsInBinaryRecord(14));
        assertEquals(1, LoopTasks.numberOfUnitsInBinaryRecord(128));
        assertEquals(0, LoopTasks.numberOfUnitsInBinaryRecord(0));
        assertEquals(1, LoopTasks.numberOfUnitsInBinaryRecord(1));
        assertEquals(2, LoopTasks.numberOfUnitsInBinaryRecord(5));
    }

    @Test
    public void testSumOfFirstNFibonacciNumbers() {
        assertEquals(20, LoopTasks.sumOfFirstNFibonacciNumbers(7));
        assertEquals(33, LoopTasks.sumOfFirstNFibonacciNumbers(8));
        assertEquals(54, LoopTasks.sumOfFirstNFibonacciNumbers(9));
        assertEquals(88, LoopTasks.sumOfFirstNFibonacciNumbers(10));
        assertEquals(143, LoopTasks.sumOfFirstNFibonacciNumbers(11));
        assertEquals(0, LoopTasks.sumOfFirstNFibonacciNumbers(1));
        assertEquals(1, LoopTasks.sumOfFirstNFibonacciNumbers(2));
    }
}