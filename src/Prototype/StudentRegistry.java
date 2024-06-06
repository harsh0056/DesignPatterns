package Prototype;

import java.util.HashMap;

public class StudentRegistry implements Registry<String,Student>{

    private  HashMap<String,Student> studentRegistry = new HashMap<>();


    @Override
    public void addPrototype(String key, Student prototype) {
        studentRegistry.put(key,prototype);
    }

    @Override
    public Student getPrototype(String key) {
        return studentRegistry.get(key);
    }
}
