package mvcdemo;

import java.util.Scanner;

public class Controller {
   private Student Smodel;
   private Group Gmodel;
   private View view;
   private DAO dao;
   Scanner scan = new Scanner(System.in);
   
   public Student addStudent(){
   System.out.print("Input name of student: ");
                    String a=scan.next();
                    System.out.println();
                    System.out.print("Input group of student: ");
                    String b=scan.next();
                    System.out.println();
                    System.out.print("Input date of enrollment: ");
                    String c= scan.next();
                    System.out.println();
                    Smodel=dao.addStudent(a,b,c);
   return Smodel;
   }
   
   public Group addGroup(){
   System.out.print("Input name of group: ");
                    String a=scan.next();
                    System.out.println();
                    System.out.print("Input faculty: ");
                    String b=scan.next();
                    System.out.println();
                    Gmodel=dao.addGroup(a,b);
   return Gmodel;
   }

   public void setStudentName(String name){
      Smodel.setName(name);		
   }
   public void setStudentDate(String date){
      Smodel.setDate(date);		
   }
   public void setGroupName(String groupName){
      Gmodel.setGroup(groupName);
      Smodel.setGroupName(groupName);
   }
   public void setGroupFaculty(String faculty){
      Gmodel.setFaculty(faculty);
   }
   public String getStudentName(){
   return Smodel.getName();		
   }
   public String getStudentGroup(){
      return Gmodel.getGroup();		
   }
   public void removeStudent(String name){
       dao.removeStudent(name);
   }
   public void removeGroup(String groupName){
       dao.removeGroup(groupName);
   }

   public void updateView(){	
      System.out.println("--------------------------------------------------");
      System.out.println("Student's Name"+" | "+"Faculty"+" | "+"Group"+" | "+"DateOfEnrollment");
      view.printDetails(getStudentName(), Gmodel.getFaculty(),getStudentGroup(),
              Smodel.getDateOfEnrollment());
   }
}
