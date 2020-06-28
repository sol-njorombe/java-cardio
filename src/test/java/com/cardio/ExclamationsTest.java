package com.cardio;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.runners.JUnit4;

public class ExclamationsTest {

  Exclamations exclamations;
  String longText = "Heyyy! This is sooooo amazinnnnng!!!!";
  ArrayList<int[]> longTextResults;

  @Before
  public void setUp() {
    exclamations = new Exclamations();
    longTextResults = exclamations.findExclamations(longText);
  }

  @Test
  public void findExclamations_ReturnsCorrectNoOfRepetitions() {
    int[] first = {2, 4};
    int[] last = {33, 36};
    Assert.assertArrayEquals(longTextResults.get(0), first);
    Assert.assertArrayEquals(longTextResults.get(longTextResults.size() - 1), last);
    Assert.assertEquals(longTextResults.size(), 4);
  }

  @Test
  public void possibleCombinations_NPow2Strings() {
    ArrayList<String> combinations = exclamations.possibleCombinations(longText, longTextResults);
    int combinationsCount = (int) Math.pow(longTextResults.size(), 2);
    Assert.assertEquals(combinations.size(), combinationsCount);
  }
}