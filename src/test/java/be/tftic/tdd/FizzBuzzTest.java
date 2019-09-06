package be.tftic.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturnOneIfNumberIs1() {
        assertEquals("1", fizzBuzz.generate(1, 1));

    }

    @Test
    public void shouldReturneTwoIfNumberIs2() {
        assertEquals("2", fizzBuzz.generate(2, 2));
    }

    @Test
    public void shouldReturnFizzIfNumberIs3() {
        assertEquals("Fizz", fizzBuzz.generate(3, 3));
    }

    @Test
    public void shouldReturnFizzIfNumberIs6() {
        assertEquals("Fizz", fizzBuzz.generate(6, 6));
    }

    @Test
    public void shouldReturnBuzzIfNumberIs5() {
        assertEquals("Buzz", fizzBuzz.generate(5, 5));
    }

    @Test
    public void shouldReturnFizzBuzzIfNumberIs15() {
        assertEquals("FizzBuzz", fizzBuzz.generate(15, 15));

    }

    @Test
    public void shouldReturnFizzBuzzIfNumberIs30() {
        assertEquals("FizzBuzz", fizzBuzz.generate(30, 30));
    }

    @Test
    public void shouldReturn12IframeAre1And2() {
        assertEquals("12", fizzBuzz.generate(1, 2));
    }


}