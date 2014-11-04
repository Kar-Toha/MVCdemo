package mvcdemo;

import java.io.IOException;
import java.util.Scanner;

public class MVCdemo {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //View sView = new View();
        //View gView = new View();
        Controller sCont=new Controller();
        Controller gCont=new Controller();
        
        System.out.println("Input command");
        while (!sc.hasNext("exit")) {
            String curStr = sc.next();
            switch (curStr.substring(0,3)) {
                case "add":
                    switch (curStr.substring(3,4)){
                        case "S":sCont.addStudent();break;
                        case "G":gCont.addGroup();break;}
                    break;
                case "set":
                    switch (curStr.substring(3,12)){ 
                        case "StudentN": sCont.setStudentName();break;
                        case "StudentD": sCont.setStudentDate();break;
                        case "StudentG": sCont.setStudentGroupName();break;}
                    switch (curStr.substring(3,9)){ 
                        case "GroupN": gCont.setGroup();break;
                        case "GroupF": gCont.setGroupFaculty();break;}
                    break;
                case "get":
                    if (curStr.substring(3,4)=="S") ;
                    if (curStr.substring(3,4)=="G") ;
                    break;
                case "rem":
                    switch (curStr.substring(6,7)){
                        case "S":sCont.removeStudent(sc.next());break;
                        case "G":gCont.removeGroup(sc.nextInt());break;}
                    break;
            }
        }
    }

}
