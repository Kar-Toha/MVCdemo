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
    public void addStudent(String name,int groupNumber) {
       Group groupOfStudent=new Group(groupNumber);
       students.add(new Student(name, groupOfStudent));
    }

    @Override
    public void addStudent(String name,String dateOfEnrollment,int groupNumber) {
       Group groupOfStudent=new Group(groupNumber);
       students.add(new Student(name, dateOfEnrollment,groupOfStudent));
    }

    @Override
    public void addGroup(int groupNumber,String faculty) {
       emptyGroups.add(new Group(groupNumber, faculty));
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
    public void removeGroup(int groupNumber) {
        for(int i=0; i<emptyGroups.size();i++){
            if(emptyGroups.get(i).getGroupNumber()==groupNumber){
                emptyGroups.remove(i);
            }
        }
        for(int i=0; i<students.size(); i++){
            if(students.get(i).getGroupOfStudent().getGroupNumber()==groupNumber){
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
    public void setStudentGroup(String name,int groupNumber){
        Group curGroup=new Group(groupNumber);
       for(int i=0; i<emptyGroups.size();i++){
           if(emptyGroups.get(i).getGroupNumber()==groupNumber){
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
    public void setGroupNumber(int oldNumber,int newNumber){
        boolean flag=false;
        for (Group emptyGroup : emptyGroups) {
            if (emptyGroup.getGroupNumber()==oldNumber) {
                flag=true;
                emptyGroup.setGroupNumber(newNumber);
            }
        }
        if(!flag){
            for(Student student:students){
           if(student.getGroupOfStudent().getGroupNumber()==oldNumber){
              student.getGroupOfStudent().setGroupNumber(newNumber);
              }
       } 
        }
    }
    @Override
    public void setGroupFaculty(int groupNumber,String faculty) {
         boolean flag=false;
        for (Group emptyGroup : emptyGroups) {
            if (emptyGroup.getGroupNumber()==groupNumber) {
                flag=true;
                emptyGroup.setFaculty(faculty);
            }
        }
        if(!flag){
            for(Student student:students){
           if(student.getGroupOfStudent().getGroupNumber()==groupNumber){
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
    public Group getGroupByNumber(int groupNumber){
        Group curGroup=null;
        boolean flag=false;
        for (Group emptyGroup : emptyGroups) {
            if (emptyGroup.getGroupNumber()==groupNumber) {
                flag=true;
                curGroup=emptyGroup;
                
            }
        }
        if(!flag){
           for(Student student:students){
           if(student.getGroupOfStudent().getGroupNumber()==groupNumber){
              curGroup=student.getGroupOfStudent();
              }
       } 
        }
        return curGroup;
    }

    @Override
    public ArrayList<Student> getAllStudents() {
       return students;
    }

    @Override
    public ArrayList<Group> getAllEmptyGroups() {
        return emptyGroups;
    }

    @Override
    public ArrayList<Student> getStudentsbyGroup(int groupNumber){
        Group curGroup=getGroupByNumber(groupNumber);
        ArrayList<Student> studentsInGroup=new ArrayList<>();
        for(Student student:students){
            if(student.getGroupOfStudent().equals(curGroup)){
                studentsInGroup.add(student);
            }
        }
        return studentsInGroup;
    }

    @Override
    public ArrayList<Student> getStudentsbyFaculty(String faculty) {
         ArrayList<Student> studentsInFaculty=new ArrayList<>();
         for(Student student:students){
            if(student.getGroupOfStudent().getFaculty().equals(faculty)){
                studentsInFaculty.add(student);
            }
        }
        return studentsInFaculty;
    }



 
    
}
