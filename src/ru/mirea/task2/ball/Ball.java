package ru.mirea.task2.ball;

public class Ball {

    private String sport;
    public Ball() {
        this.sport = "Unknown";
    }
    public Ball(String sport) {
        this.sport = sport;
    }

    public String toString() {
        return "This is a " + this.sport + " ball.";
    }
}
