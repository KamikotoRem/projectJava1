package org.example.models;

import java.util.ArrayList;

public class Student {
   private final String name;
   private final Group group;
   ArrayList<Top> tops = new ArrayList<>();
   public Student(String name, Group group, ArrayList<Top> tops){
       this.name = name;
       this.group = group;
       this.tops = tops;
   }

   public String getName(){
       return name;
   }
   public Group getGroup(){
      return group;
   }

   @Override
   public String toString(){
       return name + " " + group.toString();
   }
}
