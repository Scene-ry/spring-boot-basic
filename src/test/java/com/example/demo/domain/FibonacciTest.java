package com.example.demo.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FibonacciTest {

  @Rule
  public ExpectedException exception = ExpectedException.none();

  @Test
  public void should_return_1_when_input_1() throws Exception {
    int result = Fibonacci.getResult(1);
    assertEquals(1, result);
  }

  @Test
  public void should_return_2_when_input_3() throws Exception {
    int result = Fibonacci.getResult(3);
    assertEquals(2, result);
  }

  @Test
  public void should_throw_exception_when_input_less_than_0() throws Exception {
    exception.expect(Exception.class);
    exception.expectMessage("Invalid Input Number");
    Fibonacci.getResult(-1);
  }
}
