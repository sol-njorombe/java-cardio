package com.designpatterns.builder.codebuilder;

import java.util.HashMap;
import java.util.Map;

public class CodeBuilder
{
    String className;
    HashMap<String, String> fields = new HashMap<>();

    public CodeBuilder(String className)
    {
        this.className = className;
    }

    public CodeBuilder addField(String name, String type)
    {
       this.fields.put(name, type);
       return this;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("public class ");
        sb.append(this.className);
        sb.append("\n{\n");
        for(Map.Entry<String, String> mapElement : this.fields.entrySet()) {
            String field = (String) mapElement.getKey();
            String type = (String) mapElement.getValue();
            sb.append("  public " + type + " " + field + ";\n");
        }
        sb.append("}\n");
        return sb.toString();
    }
}