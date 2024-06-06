package Builder;

public class client {


    public static void main(String[] args) {


        Student s = Student.getBuilder()
                .setName("John")
                .setRollNo("123")
                .build();


        System.out.println("This is Student : "+ s);



    }


}
