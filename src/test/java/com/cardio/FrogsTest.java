package com.cardio;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

import com.cardio.Frogs;

import org.junit.runners.JUnit4;

public class FrogsTest {

  Frogs frogs;

  @Before
  public void setUp() {
    frogs = new Frogs();
  }

  @Test
  public void numberOfFrogs_ReturnCorrectCount() {
    assertEquals(frogs.minNoOfFrogs("crcoakroak"), 2);
    assertEquals(frogs.minNoOfFrogs("croakcroak"), 1);
  }
}