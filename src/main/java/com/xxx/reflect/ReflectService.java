package com.xxx.reflect;

public class ReflectService {
    private String name;

    public ReflectService() {
    }

    public ReflectService(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("hello"+name);
    }


}
