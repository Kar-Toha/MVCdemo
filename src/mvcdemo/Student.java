package mvcdemo;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private Group groupOfStudent;
    private String dateOfEnrollment;
    
    Student(String name,Group groupOfStudent){
        this.name=name;
        this.groupOfStudent=groupOfStudent; 
    }
    Student(String name,String dateOfEnrollment,Group groupOfStudent){
        this.name=name;
        this.groupOfStudent=groupOfStudent;  
        this.dateOfEnrollment=dateOfEnrollment;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group getGroupOfStudent() {
        return groupOfStudent;
    }

    public void setGroupOfStudent(Group groupOfStudent) {
        this.groupOfStudent = groupOfStudent;
    }

    public String getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(String date) {
        this.dateOfEnrollment = date;
    }

}
