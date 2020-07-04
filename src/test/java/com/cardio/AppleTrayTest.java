package com.cardio;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;


import org.junit.runners.JUnit4;

public class AppleTrayTest {

  @Test
  public void AppleTray_Rippen() {
    int[][] original = {
        { 2, 0, 1, 0 },
        { 0, 1, 2, 0 },
        { 1, 0, 1, 0 },
        { 2, 1, 0, 2 }};
    int[][] expected = {
        { 2, 0, 2, 0 },
        { 0, 2, 2, 0 },
        { 2, 0, 2, 0 },
        { 2, 2, 0, 2 }};
    AppleTray  appleTray = new AppleTray(original);
    int[][] rottenTray = appleTray.rippen();
    Assert.assertArrayEquals(rottenTray, expected);
  }
}