package p121.StudentGroupRegister;

public class Student extends People implements Comparable<Student> {

    String faculty;

    public Student(String name, String lastname, int age,String gender, String faculty) {
        super(name, lastname, age, gender);
        this.faculty = faculty;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.print("Факультет: "+faculty);
    }
    public String toString(){
        return "Имя: "+getName()+" Фамилия: "+getLastname()/*" Вес: "+weigth+" Рост: "+hight+" Факультет: "+faculty*/+"\n";
    }


    @Override
    public int compareTo(Student o) {
        if (o==null){return -1;}

        return this.getName().compareTo(o.getName());

    }


}
