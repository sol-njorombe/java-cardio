package com.cardio;

import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

import com.cardio.MinFrmLists;

import org.junit.runners.JUnit4;

public class MinFrmListTest {

  @Test
  public void getKMinArr_ReturnArrofKElements() {
    int[][] inputArr = new int[][] {
      {1, 5, 6},
      {3, 4, 9},
      {2, 4, 12}
    };
    int[] expected = new int[]{1, 2, 3, 4, 4};
    MinFrmLists minK = new MinFrmLists(inputArr);
    Assert.assertArrayEquals(minK.getKMinArr(5), expected);
  }
}