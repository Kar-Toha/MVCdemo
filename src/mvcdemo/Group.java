package mvcdemo;

import java.io.Serializable;

public class Group implements Serializable {

    private String groupName;
    private String faculty;
    
    Group(String groupName, String faculty){
        this.groupName=groupName;
        this.faculty=faculty;
    }
    
    public String getGroup() {
        return groupName;
    }

    public void setGroup(String group) {
        this.groupName = group;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
