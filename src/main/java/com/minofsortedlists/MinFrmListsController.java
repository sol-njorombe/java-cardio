package com.minofsortedlists;

import java.util.Arrays;

public class MinFrmListsController {
  public static void testMinKFrmList() {
    int[][] inputArr = new int[][] {
      {1, 5, 6},
      {3, 4, 9},
      {2, 4, 12}
    };
    MinFrmLists minK = new MinFrmLists(inputArr);
    int[] answer = minK.getKMinArr(5);
    System.out.println("Given input:\n" + Arrays.deepToString(inputArr));
    System.out.println("Found output:\n" + Arrays.toString(answer));
  }
}