package com.example.model;


public class Greeting {
    private int greetId;
    private String greeting;

    public Greeting(int greetId, String greeting) {
        this.greetId = greetId;
        this.greeting = greeting;
    }

    public int getGreetId() {
        return greetId;
    }

    public void setGreetId(int greetId) {
        this.greetId = greetId;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "greetId=" + greetId +
                ", greeting='" + greeting + '\'' +
                '}';
    }
}
