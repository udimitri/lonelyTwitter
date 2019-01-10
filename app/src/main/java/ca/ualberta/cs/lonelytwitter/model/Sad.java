package ca.ualberta.cs.lonelytwitter.model;

import java.text.SimpleDateFormat;

public class Sad extends Mood {
    private String MOOD = "Sad";

    Sad() {
        this.date = SimpleDateFormat.getDateInstance().toString();
    }

    Sad(String date) {
        this.date = date;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String format() {
        return this.MOOD;
    }
}
