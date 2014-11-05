package mvcdemo;

public class View {
    public void updateView(String name, String faculty,
            int groupNumber, String date){	
      System.out.println("---------------------------------------------------");
      System.out.println("Student's Name"+" | "+"Faculty"+" | "+"Group"+" | "+"DateOfEnrollment");
      printDetails(name, faculty,groupNumber,date);
   }
    public void printDetails(String name, String faculty,
            int groupNumber, String date){
      System.out.println("---------------------------------------------------");
      System.out.println(name+" | "+faculty+" | "+groupNumber+" | "+date);
      System.out.println("---------------------------------------------------");
   }
}
