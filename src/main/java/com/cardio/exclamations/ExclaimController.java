package com.cardio.exclamations;

import java.util.ArrayList;
import java.util.Arrays;

public class ExclaimController {
  public static void testExclamations() {
    String str1 = "Heyyy! This is sooooo amazinnnnng!!!!";
    Exclamations ex = new Exclamations();
    ArrayList<int[]> sln = ex.findExclamations(str1);
    System.out.println(String.format("Given %s \nwe get\n %s", str1, Arrays.deepToString(sln.toArray())));
    ArrayList<String> possibleCombinations = ex.possibleCombinations(str1, sln);
    System.out.println("Below are the possible combinations for the string");
    for (String sentence: possibleCombinations) {
      System.out.println(sentence);
    }
  }
}