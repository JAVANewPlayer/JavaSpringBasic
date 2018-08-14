package com.wacai;

public class HelloWorld {
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public void hello(){
        System.out.println("你好: " + name);
    }
}
