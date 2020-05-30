package com.rottenapples;

import java.util.HashMap;
import java.util.Map;

public class AppleTray {
  int rows;
  int cols;
  Apple[][] apples;

  AppleTray(int[][] trayArr) {
    rows = trayArr.length;
    cols = rows > 0 ? trayArr[0].length : 0;
    apples = new Apple[rows][cols];
    for (int i = 0; i < trayArr.length; i++) {
      for (int j = 0;  j < trayArr[i].length; j++) {
        apples[i][j] = new Apple(trayArr[i][j]);
      }
    }
  }

  public int[][] rippen() {
    Map<Ripeness, Integer> outputMapping = new HashMap<Ripeness, Integer>();
    outputMapping.put(Ripeness.EMPTY, 0);
    outputMapping.put(Ripeness.GOOD, 1);
    outputMapping.put(Ripeness.ROTTEN, 2);
    int[][] afterRipenTray = new int[rows][cols];
    for (int i = 0; i < apples.length; i++) {
      for (int j = 0; j < apples[i].length; j++) {
        Apple apple = apples[i][j];
        if (apple.getRipeness() == Ripeness.ROTTEN) {
          updateNeighbours(i, j);
        }
      }
    }

    for (int i = 0; i < apples.length; i++) {
      for (int j = 0; j < apples[i].length; j++) {
        afterRipenTray[i][j] = outputMapping.get(apples[i][j].getRipeness());
      }
    }
    return afterRipenTray;
  }

  void updateNeighbours(int row, int col) {
    if (row < 0 || row >= rows || col < 0 || col >= cols)
    { return; }
    Apple apple = apples[row][col];
    if (apple.getRipeness() == Ripeness.EMPTY || apple.isVisited()) {
      apple.setVisited();
      return;
    }

    apple.updateRipeness(Ripeness.ROTTEN);
    updateNeighbours(row - 1, col);
    updateNeighbours(row, col + 1);
    updateNeighbours(row + 1, col);
    updateNeighbours(row, col - 1);
  }
}