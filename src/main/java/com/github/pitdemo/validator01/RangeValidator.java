package com.github.pitdemo.validator01;

import static org.apache.commons.lang3.Validate.isTrue;

public class RangeValidator {

  private final int lowerLimit;
  private final int upperLimit;

  public RangeValidator(final int lowerLimit, final int upperLimit) {
    isTrue(lowerLimit >= 0, "lowerLimit must be greater or equal than 0");
    isTrue(upperLimit >= 0, "upperLimit must be greater or equal than 0");

    this.lowerLimit = lowerLimit;
    this.upperLimit = upperLimit;
  }

  public boolean isInRange(final int number) {
    return (lowerLimit <= number && number <= upperLimit);
  }
}
