package mvcdemo;

public class View {
    public void updateSView(String name, String faculty,
            int groupNumber, String date){	
      System.out.println("---------------------------------------------------");
      System.out.println("Student's Name"+" | "+"Faculty"+" | "+"Group"+" | "+"DateOfEnrollment");
      printDetails(name, faculty,groupNumber,date);
    }
    public void updateGView(){	
      System.out.println("---------------------------------------------------");
      System.out.println("Student's Name"+" | "+"Faculty"+" | "+"Group"+" | "+"DateOfEnrollment");
      System.out.println("---------------------------------------------------");
    }
    public void printDetails(String name, String faculty,
            int groupNumber, String date){
      System.out.println(name+" | "+faculty+" | "+groupNumber+" | "+date);
      System.out.println("---------------------------------------------------");
    }
}
