package mvcdemo;

import java.io.Serializable;
import java.util.ArrayList;

public class DAOImpl implements DAO,Serializable{
    
    ArrayList<Student> students;
    ArrayList<Group> emptyGroups;
    DAOImpl(){
        students=new ArrayList<>();
        emptyGroups=new ArrayList<>();
        }
    @Override
    public void addStudent(String name, String groupName) {
       Group groupOfStudent=new Group(groupName);
       students.add(new Student(name, groupOfStudent));
    }

    @Override
    public void addStudent(String name, String dateOfEnrollment, String groupName) {
       Group groupOfStudent=new Group(groupName);
       students.add(new Student(name, dateOfEnrollment,groupOfStudent));
    }

    @Override
    public void addGroup(String groupName, String faculty) {
       emptyGroups.add(new Group(groupName, faculty));
    }

    @Override
    public void removeStudent(String name) {
       for(int i=0; i<students.size(); i++){
           if(students.get(i).getName().equals(name)){
              students.remove(i);
           }
          
       }
    }

    @Override
    public void removeGroup(String name) {
        for(int i=0; i<emptyGroups.size();i++){
            if(emptyGroups.get(i).getGroupName().equals(name)){
                emptyGroups.remove(i);
            }
        }
        for(int i=0; i<students.size(); i++){
            if(students.get(i).getGroupOfStudent().getGroupName().equals(name)){
                students.remove(i);
            }
        }
    }

    @Override
    public void setStudentName(String oldName, String newName) {
        for(int i=0; i<students.size(); i++){
            if(students.get(i).getName().equals(oldName)){
                students.get(i).setName(newName);
            }
        }
    }

    @Override
    public void setStudentDateofEnrollment(String name,String dateofEnrollment) {
        for(int i=0; i<students.size(); i++){
            if(students.get(i).getName().equals(name)){
                students.get(i).setDateOfEnrollment(name);
            }
        }
    }

    @Override
    public void setStudentGroup(String name,String groupName) {
       
    }

    @Override
    public void setGroupName(String oldName, String newName) {
        
    }

    @Override
    public void setGroupFaculty(String groupName,String faculty) {
        
    }

    @Override
    public Student getStudentByName(String name) {
        return null;
        
    }

    @Override
    public Group getGroupByName(String name) {
        return null;
        
    }



 
    
}
