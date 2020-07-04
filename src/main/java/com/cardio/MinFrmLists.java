package com.cardio;

public class MinFrmLists {
  int[] indexPointers;
  int[][] inputArr;
  int cols;
  int rows;

  public MinFrmLists(int[][] inputArr) {
    this.inputArr = inputArr;
    this.rows = inputArr.length;
    this.cols = inputArr[0].length;
    indexPointers = new int[rows];
  }

  public int[] getKMinArr(int k) {
    int[] kMinArr = new int[k];
    for (int i = 0; i < k; i++) {
      try {
        kMinArr[i] = getNextMin();
      } catch (Exception e) {
        kMinArr[i] = 0;
      }

    }
    return kMinArr;
  }

  private int getNextMin() throws Exception {
    // assumption all values given would never exceed 99999999
    int minValue = 99999999;
    int minRow = -1;
    boolean isInitialized = false;
    for (int i = 0; i < rows; i++) {
      int currentCol = indexPointers[i];
      if (currentCol >= cols) {
        continue;
      }

      if (!isInitialized) {
        minValue = inputArr[i][currentCol];
        minRow = i;
        isInitialized = true;
        continue;
      }

      if (inputArr[i][currentCol] < minValue) {
        minValue = inputArr[i][currentCol];
        minRow = i;
      }
    }

    if (!isInitialized) {
      throw new Exception("Could not get a value");
    }
    if (minRow != -1) { indexPointers[minRow]++; }
    return minValue;
  }
}