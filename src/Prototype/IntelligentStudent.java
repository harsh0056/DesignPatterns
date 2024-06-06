package Prototype;

public class IntelligentStudent extends Student {

    private String IQ;

    public IntelligentStudent() {
    }

    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.IQ = student.IQ;
    }

    public String getIQ() {
        return IQ;
    }

    public void setIQ(String IQ) {
        this.IQ = IQ;
    }

    @Override
    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }

}
