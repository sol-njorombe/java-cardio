package com.rottenapples;

import java.util.HashMap;
import java.util.Map;

public class Apple {

  private Map<Integer, Ripeness> intMapping = new HashMap<Integer, Ripeness>();
  private boolean visited = false;
  private Ripeness ripeness;

  Apple(int value) {
    this.intMapping.put(0, Ripeness.EMPTY);
    this.intMapping.put(1, Ripeness.GOOD);
    this.intMapping.put(2, Ripeness.ROTTEN);
    if (this.intMapping.containsKey(value)) {
      this.ripeness = intMapping.get(value);
    }else{
      this.ripeness = Ripeness.EMPTY;
    }
  }

  public void updateRipeness(Ripeness ripeness) {
    this.visited = true;
    this.ripeness = ripeness;
  }

  public Ripeness getRipeness() {
    return this.ripeness;
  }

  public void setVisited() {
    this.visited = true;
  }

  public boolean isVisited() {
    return this.visited;
  }
}