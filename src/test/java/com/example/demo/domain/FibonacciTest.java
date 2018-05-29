package com.example.demo.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {

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
}
