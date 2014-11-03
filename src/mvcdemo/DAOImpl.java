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
        for (Student student : students) {
            if (student.getName().equals(oldName)) {
                student.setName(newName);
            }
        }
    }

    @Override
    public void setStudentDateofEnrollment(String name,String dateofEnrollment) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                student.setDateOfEnrollment(dateofEnrollment);
            }
        }
    }

    @Override
    public void setStudentGroup(String name,String groupName) {
        Group curGroup=new Group(groupName);
       for(int i=0; i<emptyGroups.size();i++){
           if(emptyGroups.get(i).getGroupName().equals(groupName)){
               curGroup=emptyGroups.get(i);
               emptyGroups.remove(i);
           }
       }
       for(Student student:students){
           if(student.getName().equals(name)){
              student.setGroupOfStudent(curGroup);
              }
       }
    }

    @Override
    public void setGroupName(String oldName, String newName) {
        boolean flag=false;
        for (Group emptyGroup : emptyGroups) {
            if (emptyGroup.getGroupName().equals(oldName)) {
                flag=true;
                emptyGroup.setGroupName(newName);
            }
        }
        if(!flag){
            for(Student student:students){
           if(student.getGroupOfStudent().getGroupName().equals(oldName)){
              student.getGroupOfStudent().setGroupName(newName);
              }
       } 
        }
    }
    @Override
    public void setGroupFaculty(String groupName,String faculty) {
         boolean flag=false;
        for (Group emptyGroup : emptyGroups) {
            if (emptyGroup.getGroupName().equals(groupName)) {
                flag=true;
                emptyGroup.setFaculty(faculty);
            }
        }
        if(!flag){
            for(Student student:students){
           if(student.getGroupOfStudent().getGroupName().equals(groupName)){
              student.getGroupOfStudent().setFaculty(faculty);
              }
       } 
        }
    }

    @Override
    public Student getStudentByName(String name) {
        Student curStudent=null;
        for(Student student:students){
            if(student.getName().equals(name)){
                curStudent=student;
            }
        }
        return curStudent;
    }

    @Override
    public Group getGroupByName(String name) {
        Group curGroup=null;
        boolean flag=false;
        for (Group emptyGroup : emptyGroups) {
            if (emptyGroup.getGroupName().equals(name)) {
                flag=true;
                curGroup=emptyGroup;
                
            }
        }
        if(!flag){
           for(Student student:students){
           if(student.getGroupOfStudent().getGroupName().equals(name)){
              curGroup=student.getGroupOfStudent();
              }
       } 
        }
        return curGroup;
    }



 
    
}
