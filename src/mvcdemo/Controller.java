package mvcdemo;

import java.util.Scanner;

public class Controller {
   private DAOImpl dao=new DAOImpl();
   View view = new View();
   Scanner scan = new Scanner(System.in);
   
   public void addStudent(){
       System.out.print("Input name of student: ");
       String a=scan.next();
       if (dao.getStudentByName(a)==null) {
           System.out.print("Input number of student's group: ");
           int b=scan.nextInt();
           if (dao.getGroupByNumber(b)==null) {
               System.out.print("There's no such group. To initialize it input its faculty: ");
               String c=scan.next();
               dao.addGroup(b,c);
           }
           System.out.print("Input date of enrollment: ");
           String c= scan.next();
           dao.addStudent(a,c,b);
           dao.setStudentGroup(a,b);
           System.out.println("Command is applied");
       }
       else System.out.println("This student has already registered");
       System.out.println();
       System.out.println("Input command");
   }
   
   public void addGroup(){
       System.out.print("Input number of group: ");
       int a=scan.nextInt();
       if (dao.getGroupByNumber(a)==null) {
           System.out.print("Input faculty: ");
           String b=scan.next();
           dao.addGroup(a,b);
           System.out.println("Command is applied");   
       }
       else System.out.println("This group has already registered");
       System.out.println();
       System.out.println("Input command");
   }

   public void setStudentName(){	
       System.out.print("Input old name: ");
       String a=scan.next();
       if (dao.getStudentByName(a)!=null) {
       System.out.print("Input new name: ");
       String b=scan.next();
       dao.setStudentName(a,b);
       System.out.println("Change is applied");
       }
       else System.out.println("There's no such student"); 
       System.out.println();
       System.out.println("Input command");
   }
   public void setStudentDate(){
       System.out.print("Input student's name: ");
       String a=scan.next();
       if (dao.getStudentByName(a)!=null) {
           System.out.print("Input date of enrollment: ");
           String b=scan.next();
           dao.setStudentDateofEnrollment(a,b);
           System.out.println("Change is applied");
       }
       else System.out.println("There's no such student");
       System.out.println();
       System.out.println("Input command");
   }
   public void setStudentGroupName(){
       System.out.print("Input student's name: ");
       String a=scan.next();
       if (dao.getStudentByName(a)!=null) {
           System.out.print("Input groupNumber: ");
           int b=scan.nextInt();
           dao.setStudentGroup(a,b);
           System.out.println("Change is applied");
       }
       else System.out.println("There's no such student");
       System.out.println();
       System.out.println("Input command");
   }
   public void setGroup(){
       System.out.print("Input old number of group: ");
       int a=scan.nextInt();
       if (dao.getGroupByNumber(a)!=null) {
           System.out.print("Input new number of group: ");
           int b=scan.nextInt();
           dao.setGroupNumber(a,b);
           System.out.println("Change is applied");
       }
       else System.out.println("There's no such group");
       System.out.println();
       System.out.println("Input command");
   }
   public void setGroupFaculty(){
       System.out.print("Input number of group: ");
       int a=scan.nextInt();
       if (dao.getGroupByNumber(a)!=null) {
           System.out.print("Input faculty: ");
           String b=scan.next();
           dao.setGroupFaculty(a,b);
           System.out.println("Change is applied");
       }
       else System.out.println("There's no such group");
       System.out.println();
       System.out.println("Input command");
   }
   public void getStudentData(){
       System.out.print("Input student's name: ");
       String a=scan.next();
       if (dao.getStudentByName(a)!=null)
           view.updateSView(a,dao.getFacultyOfGroup(dao.getGroupNumberOfStudent(a)),
               dao.getGroupNumberOfStudent(a),dao.getDateOfEnrollmentOfStudent(a));	
       else System.out.println("There's no such student");
       System.out.println();
       System.out.println("Input command");
   }
   public void getGroup(){
       System.out.print("Input number of group: ");
       int a=scan.nextInt();
       if (dao.getGroupByNumber(a)!=null) {
           view.updateGView();
           for (int i=0;i<dao.getStudentsbyGroup(a).size();i++) {
           view.printDetails(dao.getStudentsbyGroup(a).get(i).getName(),
                dao.getFacultyOfGroup(a),a,
                dao.getDateOfEnrollmentOfStudent(dao.getStudentsbyGroup(a).get(i).getName()));}
       }	
       else System.out.println("There's no such group");
       System.out.println();
       System.out.println("Input command");
   }
   public void removeStudent(){
       System.out.print("Input student's name: ");
       String a=scan.next();
       if (dao.getStudentByName(a)!=null) {
           dao.removeStudent(a);
           System.out.println("Notation is deleted");
       }
       else System.out.println("There's no such student");
       System.out.println();
       System.out.println("Input command");
   }
   public void removeGroup(){
       System.out.print("Input number of group: ");
       int a=scan.nextInt();
       if (dao.getGroupByNumber(a)!=null) {
           dao.removeGroup(a);
           System.out.println("Notation is deleted");
       }
       else System.out.println("There's no such group");
       System.out.println();
       System.out.println("Input command");
   }
}
