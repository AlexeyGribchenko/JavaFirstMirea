package ru.mirea.task23.listqueue;

public interface Queue {

    void enqueue(Object element);

    Object element();

    Object dequeue();

    int size();

    boolean isEmpty();

    void clear();

    String show();
}