package ca.ualberta.cs.lonelytwitter.model;

public abstract class Mood {
    public String date;

    public abstract String getDate();
    public abstract void setDate(String date);
    public abstract String format();
}
