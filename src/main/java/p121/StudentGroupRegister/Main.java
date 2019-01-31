package p121.StudentGroupRegister;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     Student p1=new Student("Petiy","Pypkin", 17,"Man","Aerospace");

        Group firstGroup=new Group();

        firstGroup.readFile("list1.txt");
        //firstGroup.addStudentInGroup(p1);
        firstGroup.addStudentInGroup(p1);

        firstGroup.sortStudentsByField("age");

        System.out.println( firstGroup);
        firstGroup.writeToFile();
        firstGroup.recruitList();
         p1.getInfo();
    }
}

