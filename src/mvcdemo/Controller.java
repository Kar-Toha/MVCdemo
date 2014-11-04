package mvcdemo;

import java.util.Scanner;

public class Controller {
   private DAO dao;
   Scanner scan = new Scanner(System.in);
   
   public void addStudent(){
   System.out.print("Input name of student: ");
                    String a=scan.next();
                    System.out.print("Input groupNumber of student: ");
                    int b=scan.nextInt();
                    System.out.print("Input date of enrollment: ");
                    String c=scan.next();
                    System.out.println();
                    dao.addStudent(a,c,b);
   }
   
   public void addGroup(){
   System.out.print("Input groupNumber: ");
                    int a=scan.nextInt();
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
       System.out.println("Input groupNumber:");
       int b=scan.nextInt();
       dao.setStudentGroup(a,b);
   }
   public void setGroup(){
       System.out.println("Input old group:");
       int a=scan.nextInt();
       System.out.println("Input new group:");
       int b=scan.nextInt();
       dao.setGroupNumber(a,b);
   }
   public void setGroupFaculty(){
       System.out.println("Input group:");
       int a=scan.nextInt();
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
       int a=scan.nextInt();
       dao.getGroupByNumber(a);		
   }
   public void removeStudent(String name){
       dao.removeStudent(name);
   }
   public void removeGroup(int groupNumber){
       dao.removeGroup(groupNumber);
   }

   /*public void updateView(){	
      System.out.println("--------------------------------------------------");
      System.out.println("Student's Name"+" | "+"Faculty"+" | "+"Group"+" | "+"DateOfEnrollment");
      view.printDetails(getStudentName(), Gmodel.getFaculty(),getStudentGroup(),
              Smodel.getDateOfEnrollment());
   }*/

}
