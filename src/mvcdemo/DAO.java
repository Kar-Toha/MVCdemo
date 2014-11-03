package mvcdemo;


public interface DAO{
    public void addStudent(String name,String groupName);
    public void addStudent(String name,String dateOfEnrollment,String groupName);
    public void addGroup(String groupName,String faculty);
    
    public void removeStudent(String name);
    public void removeGroup(String name);
    
    public void setStudentName(String oldName, String newName);
    public void setStudentDateofEnrollment(String name,String dateofEnrollment);
    public void setStudentGroup(String name,String groupName);
    public void setGroupName(String oldName, String newName);
    public void setGroupFaculty(String groupName,String faculty);
    
    public Student getStudentByName(String name);
    public Group getGroupByName(String name);
}
