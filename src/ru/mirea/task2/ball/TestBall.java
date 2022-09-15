package ru.mirea.task2.ball;

public class TestBall {
    public static void main(String[] args) {
        Ball ball1 = new Ball();
        Ball ball2 = new Ball("Volleyball");
        Ball ball3 = new Ball("Basketball");

        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);
    }
}
