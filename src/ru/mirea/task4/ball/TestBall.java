package ru.mirea.task4.ball;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(15, 30);
        System.out.println(ball);

        System.out.println("Let`s move ball to 3 x and to 4 y");
        ball.move(3, 4);

        System.out.println(ball);
        System.out.println("Now you can move ball");
        System.out.println("Enter x and y");

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        ball.move(x, y);
        System.out.println(ball);
    }
}
