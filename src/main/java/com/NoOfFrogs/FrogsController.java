package com.NoOfFrogs;

public class FrogsController {
  public static void countMinFrogs() {
    String testString = "crcoakroak";
    // String testString = "croakcroak";
    Frogs frogs = new Frogs();
    int frogCount = frogs.minNoOfFrogs(testString);
    System.out.println("Given " + testString + "\n" +
          "we have at minimum "+ frogCount +" frogs");
  }
}