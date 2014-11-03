package mvcdemo;

import java.io.Serializable;

public class Group implements Serializable {

    private String groupName;
    private String faculty;
    
    Group(String groupName){
        this.groupName=groupName;
    }
    Group(String groupName, String faculty){
        this.groupName=groupName;
        this.faculty=faculty;
    }
    
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
