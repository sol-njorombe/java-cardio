package com.designpatterns.builder.codebuilder;

public class CodeBuilderController {
  public static void viewCodeBuilder() {
    CodeBuilder cb = new CodeBuilder("Person")
                        .addField("name", "String")
                        .addField("age", "int");
    System.out.println(cb);
  }
}