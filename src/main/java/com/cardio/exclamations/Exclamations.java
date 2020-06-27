package com.cardio.exclamations;

import java.util.ArrayList;


public class Exclamations {
  public ArrayList<int[]> findExclamations(String str) {
    ArrayList<int[]> exclaimPoints = new ArrayList<>();
    if (str.length() < 3) {
      return exclaimPoints;
    }

    boolean btwExclaim = false;
    int exclaimStart = 0;

    for (int charIndex = 0; charIndex <= str.length() - 2; charIndex++) {

      if (charIndex + 2 >= str.length() && btwExclaim) {
        int[] indexes = {exclaimStart, charIndex + 1};
        exclaimPoints.add(indexes);
        continue;
      }

      if (charIndex + 2 >= str.length()) {
        continue;
      }

      char first = str.charAt(charIndex);
      char second = str.charAt(charIndex + 1);
      char third = str.charAt(charIndex + 2);

      if (first == second && second == third && !btwExclaim) {
        exclaimStart = charIndex;
        btwExclaim = true;
      }

      if (first == second && second != third && btwExclaim) {
        btwExclaim = false;
        int[] indexes = {exclaimStart, charIndex + 1};
        exclaimPoints.add(indexes);
      }
    }

    return exclaimPoints;
  }

  public ArrayList<String> possibleCombinations(String sentence, ArrayList<int[]> exclaimPoints) {
    ArrayList<String> combinations = new ArrayList<>();
    if (exclaimPoints.size() == 0) {
      combinations.add(sentence);
      return combinations;
    }
    combinations.add("");
    int appendIndex = 0;
    for (int[] bounds: exclaimPoints) {
      appendCombStrings(combinations, bounds, appendIndex, sentence);
      ArrayList<String> newCombinations = new ArrayList<>();
      for (int i = 0; i < combinations.size(); i++) {
        String newStr = combinations.get(i);
        char boundChar = sentence.charAt(bounds[0]);
        newCombinations.add(newStr + boundChar);
        newCombinations.add(newStr + boundChar + boundChar);
      }
      combinations = newCombinations;
      appendIndex = bounds[1] + 1;
    }
    if (appendIndex < sentence.length()) {
      for (int i = 0; i < combinations.size(); i++) {
        String newStr = combinations.get(i) + sentence.substring(appendIndex, sentence.length() - 1);
        combinations.set(i, newStr);
      }
    }

    return combinations;
  }

  public void appendCombStrings(
    ArrayList<String> combinations,
    int[] bounds,
    int appendIndex,
    String sentence) {
    String appendStr = sentence.substring(appendIndex, bounds[0]);
    for (int i = 0; i < combinations.size(); i++) {
      String newStr = combinations.get(i) + appendStr;
      combinations.set(i, newStr);
    }
  }
}