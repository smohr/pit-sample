package com.github.pitdemo.validator01;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class RangeValidatorTest {

  @Test
  public void shouldReturnTrueIfInsideRange() {
    RangeValidator validator = new RangeValidator(10, 15);
    boolean inRange = validator.isInRange(12);
    assertThat(inRange).isTrue();
  }

  @Test
  public void shouldReturnFalseIfOutsideRange() {
    RangeValidator validator = new RangeValidator(10, 15);
    boolean inRange = validator.isInRange(20);
    assertThat(inRange).isFalse();
  }

}
