package com.cardio.frogs;

import java.util.ArrayList;
import java.util.HashMap;

public class Frogs {
  static String CROAK = "croak";
  private HashMap<Character, Integer> charMapping;

  public int minNoOfFrogs(String croaks) {
    ArrayList<String> croaksList = new ArrayList<>();
    ArrayList<Boolean> frogFlags = new ArrayList<>();

    for (int i = 0; i < croaks.length(); i++) {
      char currentChar = croaks.charAt(i);
      if(currentChar == CROAK.charAt(0)) {
        boolean switchedStr = false;
        for (int k = 0; k < croaksList.size(); k++) {
          String potentialWord = croaksList.get(k);
          if (potentialWord.equals(CROAK)) {
            croaksList.set(k, Character.toString(currentChar));
            switchedStr = true;
            continue;
          }
        }
        if (!switchedStr) {
          croaksList.add(Character.toString(currentChar));
          frogFlags.add(false);
        }
        continue;
      }

      int charIndex = getCharIndex(croaks.charAt(i));
      if (charIndex == -1) {
        continue;
      }

      for (int j = 0; j < croaksList.size(); j++) {
        String candidate = croaksList.get(j);
        if (candidate.charAt(candidate.length() - 1) == CROAK.charAt(charIndex - 1)) {
          String newString = candidate + Character.toString(currentChar);
          croaksList.set(j, newString);
          if (newString.equals(CROAK)) {
            frogFlags.set(j, true);
          }
        }
      }
    }

    int frogCount = 0;
    for (boolean frog: frogFlags) {
      if (frog) frogCount++;
    }
    return frogCount;
  }

  private int getCharIndex(char chr) {
    if (charMapping == null) {
      charMapping = new HashMap<Character, Integer>();
      for (int i = 0; i < CROAK.length(); i++) {
        charMapping.put(CROAK.charAt(i), i);
      }
    }
    if (charMapping.containsKey(chr)) {
      return charMapping.get(chr);
    }
    return -1;
  }
}