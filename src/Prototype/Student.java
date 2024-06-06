package Prototype;

public class Student implements Prototype<Student> {

private String name;
    private int age;
    private String address;
    private String batch ;
    private String college;

    public Student() {
    }

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.address = student.address;
        this.batch = student.batch;
        this.college = student.college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", batch='" + batch + '\'' +
                ", college='" + college + '\'' +
                '}';
    }

    @Override
    public Student copy() {
        return new Student(this);
    }
}
