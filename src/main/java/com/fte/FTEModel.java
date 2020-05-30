package com.fte;

import java.util.ArrayList;
import java.util.Arrays;

public class FTEModel {
  FTE fte1 = new FTE("fte1");
  FTE fte2 = new FTE("fte2");
  FTE fte3 = new FTE("fte3");
  FTE fte4 = new FTE("fte4");
  FTE fte5 = new FTE("fte5");
  FTE fte6 = new FTE("fte6");
  FTE fte7 = new FTE("fte7");

  public void addEmployees() {
    FTE[] fte1Reports = {fte2, fte3, fte4};
    FTE[] fte2Reports = {fte5, fte6};
    FTE[] fte3Reports = {fte7};
    fte1.addDirectReports(new ArrayList<>(Arrays.asList(fte1Reports)));
    fte2.addDirectReports(new ArrayList<>(Arrays.asList(fte2Reports)));
    fte3.addDirectReports(new ArrayList<>(Arrays.asList(fte3Reports)));
    System.out.println("FTE1 Employees \n" + fte1.toString(0));
  }

  void findEmployee() {
    FTE found = this.fte1.findReporter("fte5");
    if (found == null) {
      System.out.println("The FTE could not be found");
    } else {
      System.out.println("Found FTE");
    }
  }

  void validateDirectReports() {}
}