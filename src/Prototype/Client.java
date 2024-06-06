package Prototype;

public class Client {

    private final static StudentRegistry registry = new StudentRegistry();

    public static  void fillRegistry() {

        Student harsh =   new Student();
        harsh.setName("Harsh");
        harsh.setAge(25);
        harsh.setAddress("Delhi");
        harsh.setCollege("HansRaj");
        harsh.setBatch("CSE");

        IntelligentStudent sanjay = new IntelligentStudent();
        sanjay.setCollege("DTU");
        sanjay.setBatch("CS");

        registry.addPrototype(harsh.getBatch(), harsh);
        registry.addPrototype(sanjay.getBatch(), sanjay);



    }

    public static void main(String[] args) {


        fillRegistry();

        Student harsh = registry.getPrototype("CSE").copy();
        harsh.setName("Harsh");
        harsh.setCollege("karodimal");
        System.out.println("This is harsh object in string : "+harsh.toString());

        Student student =  registry.getPrototype("CS").copy();
        student.setName("Sanjay");

        System.out.println("This is student object in string : "+student.toString());

        //


    }


}
