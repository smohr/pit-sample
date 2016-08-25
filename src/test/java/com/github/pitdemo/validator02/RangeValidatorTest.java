package com.github.pitdemo.validator02;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class RangeValidatorTest {

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void shouldThrowExceptionIfLowerLimitIsNegative() {
    new RangeValidator(-1, 0);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void shouldThrowExceptionIfUpperLimitIsNegative() {
    new RangeValidator(0, -1);
  }

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

  @Test
  public void shouldReturnTrueIfValueIsEqualToLowerLimit() {
    RangeValidator validator = new RangeValidator(10, 15);
    boolean inRange = validator.isInRange(10);
    assertThat(inRange).isTrue();
  }

  @Test
  public void shouldReturnTrueIfValueIsEqualToUpperLimit() {
    RangeValidator validator = new RangeValidator(10, 15);
    boolean inRange = validator.isInRange(15);
    assertThat(inRange).isTrue();
  }


}
