package ru.mirea.task7.movable;


public class MovableTester {
    public static void main(String[] args) {
        System.out.println("Создаем первый прямоугольник:");
        MovableRectangle obj1 = new MovableRectangle(1, 1, 5, 5, 1, 3, 1, 1);

        System.out.println("Создаем второй прямоугольник:");
        MovableRectangle obj2 = new MovableRectangle(1, 1, 5, 5, 1, 1, 1, 1);
        obj2.moveLeft();
        obj2.moveUp();
        obj2.moveRight();
        obj2.moveDown();
        System.out.println(obj2);
    }
}