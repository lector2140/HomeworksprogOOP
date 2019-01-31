package p274.CopyFilesByFilter;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the path from where to copy files: ");
        String directoryFrom=sc.nextLine();
        System.out.println("Enter the path where to copy files: ");
        String directoryTo=sc.nextLine();
        System.out.println("Enter the extansions(space separated): ");
        String ext=sc.nextLine();

        CopyByFilter files=new CopyByFilter(directoryFrom,directoryTo,ext);
        files.copy();
    }
}
/*
"docx","txt"
        "D:\Java\Projects\HomeworksprogOOP\src\main\resources\resources_p274_CopyFilesByFilter\from"
        "D:\\Java\\Projects\\CopyFiles\\from"*/
