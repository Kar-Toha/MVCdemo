package mvcdemo;

import java.util.Scanner;

public class Controller {
   private DAO dao;
   Scanner scan = new Scanner(System.in);
   
   public void addStudent(){
   System.out.print("Input name of student: ");
                    String a=scan.next();
                    System.out.print("Input group of student: ");
                    String b=scan.next();
                    System.out.print("Input date of enrollment: ");
                    String c= scan.next();
                    System.out.println();
                    dao.addStudent(a,b,c);
   }
   
   public void addGroup(){
   System.out.print("Input group: ");
                    String a=scan.next();
                    System.out.print("Input faculty: ");
                    String b=scan.next();
                    System.out.println();
                    dao.addGroup(a,b);
   }

   public void setStudentName(){	
       System.out.println("Input old name:");
       String a=scan.next();
       System.out.println("Input new name:");
       String b=scan.next();
       dao.setStudentName(a,b);
   }
   public void setStudentDate(){
       System.out.println("Input student's name:");
       String a=scan.next();
       System.out.println("Input date of enrollment:");
       String b=scan.next();
       dao.setStudentDateofEnrollment(a,b);
   }
   public void setStudentGroupName(){
       System.out.println("Input student's name:");
       String a=scan.next();
       System.out.println("Input group:");
       String b=scan.next();
       dao.setStudentGroup(a,b);
   }
   public void setGroup(){
       System.out.println("Input old group:");
       String a=scan.next();
       System.out.println("Input new group:");
       String b=scan.next();
       dao.setGroupName(a,b);
   }
   public void setGroupFaculty(){
       System.out.println("Input group:");
       String a=scan.next();
       System.out.println("Input faculty:");
       String b=scan.next();
       dao.setGroupFaculty(a,b);
   }
   public void getStudentData(){
       System.out.println("Input student's name:");
       String a=scan.next();
       dao.getStudentByName(a);		
   }
   public void getGroup(){
       System.out.println("Input group:");
       String a=scan.next();
       dao.getGroupByName(a);		
   }
   public void removeStudent(String name){
       dao.removeStudent(name);
   }
   public void removeGroup(String groupName){
       dao.removeGroup(groupName);
   }

   /*public void updateView(){	
      System.out.println("--------------------------------------------------");
      System.out.println("Student's Name"+" | "+"Faculty"+" | "+"Group"+" | "+"DateOfEnrollment");
      view.printDetails(getStudentName(), Gmodel.getFaculty(),getStudentGroup(),
              Smodel.getDateOfEnrollment());
   }*/

}
