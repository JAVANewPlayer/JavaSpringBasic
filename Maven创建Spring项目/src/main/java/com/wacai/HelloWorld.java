package com.wacai;

public class HelloWorld {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("Message是: " + message);
        this.message = message;
    }
}
