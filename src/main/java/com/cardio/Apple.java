package com.cardio;

import java.util.HashMap;
import java.util.Map;

public class Apple {

  private Map<Integer, AppleRipeness> intMapping = new HashMap<Integer, AppleRipeness>();
  private boolean visited = false;
  private AppleRipeness ripeness;

  Apple(int value) {
    this.intMapping.put(0, AppleRipeness.EMPTY);
    this.intMapping.put(1, AppleRipeness.GOOD);
    this.intMapping.put(2, AppleRipeness.ROTTEN);
    if (this.intMapping.containsKey(value)) {
      this.ripeness = intMapping.get(value);
    }else{
      this.ripeness = AppleRipeness.EMPTY;
    }
  }

  public void updateRipeness(AppleRipeness ripeness) {
    this.visited = true;
    this.ripeness = ripeness;
  }

  public AppleRipeness getRipeness() {
    return this.ripeness;
  }

  public void setVisited() {
    this.visited = true;
  }

  public boolean isVisited() {
    return this.visited;
  }
}