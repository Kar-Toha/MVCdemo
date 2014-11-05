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
           System.out.print("Input groupNumber of student: ");
           int b=scan.nextInt();
           System.out.print("Input date of enrollment: ");
           String c= scan.next();
           dao.addStudent(a,c,b);
           System.out.println("Command is applied");
       }
       else System.out.println("This student has already registered");
       System.out.println();
       System.out.println("Input command");
   }
   
   public void addGroup(){
       System.out.print("Input groupNumber: ");
       int a=scan.nextInt();
       System.out.print("Input faculty: ");
       String b=scan.next();
       dao.addGroup(a,b);
       System.out.println("Command is applied");
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
       System.out.print("Input old group: ");
       int a=scan.nextInt();
       System.out.print("Input new group: ");
       int b=scan.nextInt();
       dao.setGroupNumber(a,b);
       System.out.println("Change is applied");
       System.out.println();
       System.out.println("Input command");
   }
   public void setGroupFaculty(){
       System.out.print("Input group: ");
       int a=scan.nextInt();
       System.out.print("Input faculty: ");
       String b=scan.next();
       dao.setGroupFaculty(a,b);
       System.out.println("Change is applied");
       System.out.println();
       System.out.println("Input command");
   }
   public void getStudentData(){
       System.out.print("Input student's name: ");
       String a=scan.next();
       if (dao.getStudentByName(a)!=null)
           view.updateView(a,dao.getFacultyOfGroup(dao.getGroupNumberOfStudent(a)),
               dao.getGroupNumberOfStudent(a),dao.getDateOfEnrollmentOfStudent(a));	
       else System.out.println("There's no such student");
       System.out.println();
       System.out.println("Input command");
   }
   public void getGroup(){
       System.out.print("Input group: ");
       int a=scan.nextInt();
       dao.getGroupByNumber(a);		
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
       System.out.print("Input group: ");
       int a=scan.nextInt();
       dao.removeGroup(a);
       System.out.println("Notation is deleted");
       System.out.println();
       System.out.println("Input command");
   }
}
