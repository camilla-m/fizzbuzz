package com.fizzbuzz.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void shouldReturnListOf1To100() {
        assertEquals(100, fizzBuzz.count().size());
    }

    @Test
    public void shouldReturnFizzWhenNumberIsDivisibleBy3() {
        assertEquals("Fizz", fizzBuzz.evaluateNumber(3));
        assertEquals("Fizz", fizzBuzz.evaluateNumber(6));
        assertEquals("Fizz", fizzBuzz.evaluateNumber(9));
    }

    @Test
    public void shouldReturnBuzzWhenNumberIsDivisibleBy5() {
        assertEquals("Buzz", fizzBuzz.evaluateNumber(5));
        assertEquals("Buzz", fizzBuzz.evaluateNumber(10));
        assertEquals("Buzz", fizzBuzz.evaluateNumber(20));
        assertEquals("Buzz", fizzBuzz.evaluateNumber(35));
    }

    @Test
    public void shouldReturnFizzBuzzWhenNumberIsDivisibleBy3AndBy5() {
        assertEquals("FizzBuzz", fizzBuzz.evaluateNumber(15));
        assertEquals("FizzBuzz", fizzBuzz.evaluateNumber(30));
    }

    @Test
    public void shouldReturnNumberWhenItsNotDivisibleByNeither() {
        assertEquals("1", fizzBuzz.evaluateNumber(1));
        assertEquals("2", fizzBuzz.evaluateNumber(2));
    }
}