package Builder;

public class Student {

    private String name;
    private String rollNo;
    private String address;
    private String phone;
    private String email;
    private String dob;
    private String college ;

   private Student(){

   }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", college='" + college + '\'' +
                '}';
    }

    public static StudentBuilder getBuilder() {
       return new StudentBuilder();
   }

    public static class StudentBuilder{
         private String name;
         private String rollNo;
         private String address;
         private String phone;
         private String email;
         private String dob;
         private String college ;

        public StudentBuilder setName(String name){
            this.name = name;
            return this;
        }

        public StudentBuilder setRollNo(String rollNo){
            this.rollNo = rollNo;
            return this;
        }

         public  StudentBuilder setAddress(String address){
              this.address = address;
              return this;
         }

         public StudentBuilder setPhone(String phone){
              this.phone = phone;
              return this;
         }

         public StudentBuilder setEmail(String email){
              this.email = email;
              return this;
         }

         public StudentBuilder setDob(String dob){
              this.dob = dob;
              return this;
         }

         public StudentBuilder setCollege(String college){
              this.college = college;
              return this;
         }

         public Student build(){
              Student student = new Student();
              student.name = this.name;
              student.rollNo = this.rollNo;
              student.address = this.address;
              student.phone = this.phone;
              student.email = this.email;
              student.dob = this.dob;
              student.college = this.college;
              return student;
         }
    }


}
