package mvcdemo;

public class View {
    public void printStudentDetails(String studentName, String studentRollNo){
      System.out.println("Student: ");
      System.out.println("Name: " + studentName);
      System.out.println("Roll No: " + studentRollNo);
   }
    public void printGroupDetails(String groupNo, String departmentGroup){
      System.out.println("Group: ");
      System.out.println("Number: " + groupNo);
      System.out.println("Department: " + departmentGroup);
   }
}
