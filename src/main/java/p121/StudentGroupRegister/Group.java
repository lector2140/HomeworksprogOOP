package p121.StudentGroupRegister;
import java.io.*;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;

public class Group implements Voencom{
    Student[] arr = new Student[10];

    public void addStudentInGroup(Student student) {
        try {
            for (int i = 0; i <= arr.length; i++) {
                if (arr[i] == null) {
                    arr[i] = student;
                    break;
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Група укомплектована");
        }

    }

    public void delStudentFromGroup(int index) {
        arr[index] = null;
    }

    public String searchStudentByLastname(String lastname) {

        String out = "Not found";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }
            if (arr[i].getLastname().equals(lastname)) {
                out = "Found on position " + i;
                break;
            }
        }
        return out;
    }

    public void sortStudentsByField(String byWhatSort) {
        /*Comparator<Student> byName=Comparator.comparing(Student::getName);
        Comparator<Student> byLastName=Comparator.comparing(Student::getLastname);
        Comparator<Student> byAge=Comparator.comparing(Student::getAge);
        Comparator<Student> byGender=Comparator.comparing(Student::getGender);*/

        switch (byWhatSort) {

            case "name":
                Arrays.sort(arr, Comparator.nullsLast(Comparator.comparing(Student::getName)));
                break;
            case "lastname":
                Arrays.sort(arr, Comparator.nullsLast(Comparator.comparing(Student::getLastname)));
                break;
            case "age":
                Arrays.sort(arr, Comparator.nullsLast(Comparator.comparing(Student::getAge)));
                break;
            case "gender":
                Arrays.sort(arr, Comparator.nullsLast(Comparator.comparing(Student::getGender)));
                break;
            default:
                System.out.println("Необходимо выбрать поле для сортировки: " + "name/lastname/age/gender");
        }
    }

    public void readFile(String fileName) {
        try {
            // InputStream is=
            BufferedReader bufer = new BufferedReader(new InputStreamReader((
                    new FileInputStream("src\\main\\resources\\resources_p121_StudentGroupRegister\\" + fileName)), "Cp1251"));

            for (int i = 0; i <= arr.length; i++) {
                String text = bufer.readLine();
                if (text != null) {
                    String[] line = text.split("\\s+");
                    arr[i] = new Student(line[0], line[1], Integer.parseInt(line[2]), line[3], line[4]);
                }
            }
        } catch (IOException e) {
            System.out.print("Ошибка чтения " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключите кого то из списка, в групе не больше 10 человек");
        }
    }

    public void writeToFile() {
        try( BufferedWriter bw = new BufferedWriter(new FileWriter("src\\main\\resources\\resources_p121_StudentGroupRegister\\result.txt"));) {

            for (Student a : arr) {
                bw.write(a.toString());
                         }
           // bw.close();
        }
        catch (NullPointerException e) {
            System.out.println("Список пуст, нечего записывать");

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void recruitList() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("src\\main\\resources\\resources_p121_StudentGroupRegister\\recruits.txt"));
            for (Student a : arr) {
                if(a!=null) {
                    if ((a.getAge() > 18) && (a.getGender().equals("Мужчина") || a.getGender().equals("Man"))) {
                        bw.write(a.toString());
                    }
                }else {System.out.println("Список пуст, не из кого выбирать");
                break;}
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String toString() {

        return Arrays.toString(arr);
    }
}
