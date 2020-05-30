package com.rottenapples;

import java.util.Arrays;

public class RottenApplesController {
  public static void testFunction() {
    int[][] tray = {
      { 2, 0, 1, 0 },
      { 0, 1, 2, 0 },
      { 1, 0, 1, 0 },
      { 2, 1, 0, 2 }};
    AppleTray appleTray = new AppleTray(tray);
    int[][] rottenTray = appleTray.rippen();
    System.out.println("Input: \n" + Arrays.deepToString(tray));
    System.out.println("Output: \n" + Arrays.deepToString(rottenTray));
  }
}