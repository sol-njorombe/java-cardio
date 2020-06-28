package com;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class StarterTest {
  @Test
  public void assertFake() {
    assertTrue(testBool());
  }

  private boolean testBool() {
    return true;
  }
}