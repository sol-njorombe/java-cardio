package com.fte;

import java.util.ArrayList;

public class FTE {
  private static int PERSONAL_WEIGHT = 1;
  private String empId;
  private ArrayList<FTE> directReports = new ArrayList<>();

  FTE(String id) {
    this.empId = id;
  }

  public boolean isEmpId(String id) {
    return this.empId == id;
  }

  public void addDirectReports(ArrayList<FTE> directReports) {
    for (FTE fte : directReports) {
      this.directReports.add(fte);
    }
  }

  public int getWeight() {
    int totalWeight = PERSONAL_WEIGHT;
    for (FTE fte : directReports) {
      totalWeight += fte.getWeight();
    }
    return totalWeight;
  }

  public FTE findReporter(String id) {
    if (isEmpId(id)) {
      return this;
    }
    for (FTE fte : directReports) {
      if (fte.isEmpId(id)) {
        return fte;
      }
    }
    for (FTE fte : directReports) {
      return fte.findReporter(id);
    }
    return null;
  }

  public String toString(int indent) {
    StringBuilder sb = new StringBuilder();
    String indentStr = indentString(indent);
    sb.append(indentStr + this.empId + " - "+ this.getWeight() + "\n");
    for (FTE fte : directReports) {
      sb.append(fte.toString(indent+1));
    }
    return sb.toString();
  }

  private String indentString(int indent) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < indent; i++) {
      sb.append("  ");
    }
    return sb.toString();
  }
}