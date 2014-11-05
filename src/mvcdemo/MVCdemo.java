package mvcdemo;

import java.io.IOException;
import java.util.Scanner;

public class MVCdemo {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Controller cont=new Controller();
        
        System.out.println("Input command");
        while (!sc.hasNext("exit")) {
            String curStr = sc.next();
            if (curStr.length()<3) {
                System.out.println("Inputed command is incorrect");
                System.out.println();
                System.out.println("Input command");}
            else 
            switch (curStr.substring(0,3)) {
                case "add":
                    switch (curStr.substring(3,4)){
                        case "S":cont.addStudent();break;
                        case "G":cont.addGroup();break;}
                    break;
                case "set":
                    switch (curStr.substring(3,11)){ 
                        case "StudentN": cont.setStudentName();break;
                        case "StudentD": cont.setStudentDate();break;
                        case "StudentG": cont.setStudentGroupName();break;}
                    switch (curStr.substring(3,9)){ 
                        case "GroupN": cont.setGroup();break;
                        case "GroupF": cont.setGroupFaculty();break;}
                    break;
                case "get":
                    switch (curStr.substring(3,4)) {
                        case "S":cont.getStudentData();break;
                        case "G":break;}
                    break;
                case "rem":
                    switch (curStr.substring(6,7)){
                        case "S":cont.removeStudent();break;
                        case "G":cont.removeGroup();break;}
                    break;
                default:{
                    System.out.println("Inputed command is incorrect");
                    System.out.println();
                    System.out.println("Input command");}break;
            }
        }
    }

}
