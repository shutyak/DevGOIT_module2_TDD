import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalcTest {

    @Test
    void sum() {

        //Given
        final var myCalc = new MyCalc();

        //When
        final int a = 1;
        final int b = 1;
        final int result = myCalc.sum(a, b);

        //Then
        final int expected = 2;
        assertEquals(expected,result);
    }

    @Test
    void sumNegative() {

        //Given
        final var myCalc = new MyCalc();

        //When
        final int a = 2;
        final int b = -22;
        final int result = myCalc.sum(a, b);

        //Then
        final int expected = -20;
        assertEquals(expected,result);
    }

    @Test
    void sub() {

        //Given
        final var myCalc = new MyCalc();

        //When
        final int a = 2;
        final int b = 1;
        final int result = myCalc.sub(a, b);

        //Then
        final int expected = 1;
        assertEquals(expected,result);
    }
    @Test
    void subNegative() {

        //Given
        final var myCalc = new MyCalc();

        //When
        final int a = 1;
        final int b = 21;
        final int result = myCalc.sub(a, b);

        //Then
        final int expected = -20;
        assertEquals(expected,result);
    }
}