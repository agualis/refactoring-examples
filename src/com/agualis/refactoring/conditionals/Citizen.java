package com.agualis.refactoring.conditionals;

public class Citizen {
  private static final double DEAD_AMOUNT = 20;
  private static final double SEPARATED_AMOUNT = 30;
  private static final double RETIRED_AMOUNT = 40;
  private static final double NORMAL_AMOUNT = 50;

  boolean isDead = false;
  boolean isSeparated = false;
  boolean isRetired = false;

  public double getPayAmount() {
    double result;
    if (isDead){
      result = deadAmount();
    }
    else {
      if (isSeparated){
        result = separatedAmount();
      }
      else {
        if (isRetired){
          result = retiredAmount();
        }
        else{
          result = normalPayAmount();
        }
      }
    }
    return result;
  }

  private double deadAmount() {
    return DEAD_AMOUNT;
  }

  private double separatedAmount() {
    return SEPARATED_AMOUNT;
  }

  private double retiredAmount() {
    return RETIRED_AMOUNT;
  }

  private double normalPayAmount() {
    return NORMAL_AMOUNT;
  }

  public void die() {
    isDead = true;
  }

  public void separate() {
    isSeparated = true;
  }

  public void retire() {
    isRetired = true;
  }
}
