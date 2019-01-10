package ca.ualberta.cs.lonelytwitter.model;

import java.text.SimpleDateFormat;

public class Happy extends Mood {
    private String MOOD = "Happy";

    Happy() {
        this.date = SimpleDateFormat.getDateInstance().toString();
    }

    Happy(String date) {
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
