package mvcdemo;

import java.util.ArrayList;


public interface DAO{
    public void addStudent(String name,int groupNumber);
    public void addStudent(String name,String dateOfEnrollment,int groupNumber);
    public void addGroup(int groupNumber,String faculty);
    
    public void removeStudent(String name);
    public void removeGroup(int groupNumber);
    
    public void setStudentName(String oldName, String newName);
    public void setStudentDateofEnrollment(String name,String dateofEnrollment);
    public void setStudentGroup(String name,int groupNumber);
    public void setGroupNumber(int oldNumber,int newNumber);
    public void setGroupFaculty(int groupNumber,String faculty);
    
    public Student getStudentByName(String name);
    public Group getGroupByNumber(int groupNumber);
    public ArrayList<Student> getAllStudents();
    public ArrayList<Group> getAllEmptyGroups();
    public ArrayList<Student> getStudentsbyGroup(int groupNumber);
    public ArrayList<Student> getStudentsbyFaculty(String faculty);
    public String getDateOfEnrollmentOfStudent(String name);
    public int getGroupNumberOfStudent(String name);
    public String getFacultyOfGroup(int groupNumber);
    
    
}
