package com.example.model;

public class Farewell {
    private int farewellId;
    private String farewell;

    public Farewell(int farewellId, String farewell) {
        this.farewellId = farewellId;
        this.farewell = farewell;
    }

    public int getFarewellId() {
        return farewellId;
    }


    public String getFarewell() {
        return farewell;
    }

    public void setFarewell(String farewell) {
        this.farewell = farewell;
    }

    @Override
    public String toString() {
        return "Farewell{" +
                "farewellId=" + farewellId +
                ", farewell='" + farewell + '\'' +
                '}';
    }
}
