package p121.StudentGroupRegister;

public class People {
    private int age;
    private String lastname;
    private String name;
    private String gender;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

        public People( String name, String lastname,int age, String gender) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.lastname = lastname;
    }

    public void getInfo(){
        System.out.print("Имя: "+name+"\nФамилия: "+lastname+"\nВозраст: "+age+"\nПол: "+gender+"\n");
    }
}
