package mvcdemo;

import java.io.IOException;
import java.util.Scanner;

public class MVCdemo {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        View sView = new View();
        View gView = new View();
        Controller sCont=new Controller();
        Controller gCont=new Controller();
        while (!sc.hasNext("exit")) {
            System.out.println("Input command");
            String curStr = sc.next();
            switch (curStr.substring(0,3)) {
                case "add":
                    if (curStr.substring(3,4)=="S")
                    sCont.addStudent();
                    if (curStr.substring(3,4)=="G")
                    gCont.addGroup();
                    break;
                case "set":
                    if (curStr.substring(3,12)=="StundentN") 
                        sCont.setStudentName(sc.next());
                    if (curStr.substring(3,12)=="StundentD") 
                        sCont.setStudentDate(sc.next());
                    if (curStr.substring(3,12)=="StundentG") 
                        sCont.setGroupName(sc.next());
                    if (curStr.substring(3,9)=="GroupN") 
                        gCont.setGroupName(sc.next());
                    if (curStr.substring(3,9)=="GroupF") 
                        gCont.setGroupFaculty(sc.next());
                    break;
                case "get":
                    if (curStr.substring(3,4)=="S") ;
                    if (curStr.substring(3,4)=="G") ;
                    break;
                case "rem":
                    if (curStr.substring(6,7)=="S")
                        sCont.removeStudent(sc.next());
                    if (curStr.substring(6,7)=="G") 
                        sCont.removeGroup(sc.next());
                    break;
            }
        }
    }

}
