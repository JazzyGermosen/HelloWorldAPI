package com.example.model;

public class Conversation {
    private int convoId;
    private int greetId;
    private int farewellId;

    public Conversation(int convoId, int greetId, int farewellId) {
        this.convoId = convoId;
        this.greetId = greetId;
        this.farewellId = farewellId;
    }

    public int getConvoId() {
        return convoId;
    }

    public void setConvoId(int convoId) {
        this.convoId = convoId;
    }

    public int getGreetId() {
        return greetId;
    }

    public void setGreetId(int greetId) {
        this.greetId = greetId;
    }

    public int getFarewellId() {
        return farewellId;
    }

    public void setFarewellId(int farewellId) {
        this.farewellId = farewellId;
    }

    @Override
    public String toString() {
        return "Conversation{" +
                "convoId=" + convoId +
                ", greetId=" + greetId +
                ", farewellId=" + farewellId +
                '}';
    }
}
