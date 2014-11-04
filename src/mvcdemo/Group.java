package mvcdemo;

import java.io.Serializable;

public class Group implements Serializable {

    private int groupNumber;
    private String faculty;
    
    Group(int groupNumber){
        this.groupNumber=groupNumber;
    }
    Group(int groupNumber, String faculty){
        this.groupNumber=groupNumber;
        this.faculty=faculty;
    }
    
    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
