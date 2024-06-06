package Singleton;

public class Student {

    private String name;
    private int age;

    private String address;

    private static Student studentInstance=null;

    private Student(){

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

    public static Student getInstance(){
        if(studentInstance==null){
            studentInstance=new Student();
        }
        return studentInstance;
    }


}
